package com.thegayman.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
 



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.thegayman.model.User;
import com.thegayman.service.UserService;
import com.thegayman.utils.ConstantUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 用户表(user)
 * 
 * @author yesl
 * @date 2017-07-27 11:07:10
 */
@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;
  private ObjectMapper MAPPER = new ObjectMapper();
	/**
	 * 按id查询数据
	 * 
	 * @author qiji
	 * @email liyq.qiji@foxmail.com
	 * @date 2017-04-26 09:06:28
	 */
	@RequestMapping(value = "message", method = RequestMethod.GET)
	public String info() {
		String message = "显示alsdjlajsdlasd成功";
		return message;

	}

	/**
	 * 用户注册
	 * 
	 * @author qiji
	 * @email liyq.qiji@foxmail.com
	 * @date 2017-04-26 09:06:28
	 */
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String save(HttpServletRequest request) {
		
		try { 
			String param =request.getParameter("user");
			User user = MAPPER.readValue(param, User.class);	
			user.setUid( new Random().nextInt());		 
			this.userService.save(user);	
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "注册失败";
		}	
		return "注册成功";
	}
	/**
	 * 登录
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "login" )
	public List<Map<String,Object>> login(HttpServletRequest request){
		List<Map<String,Object>> message = new ArrayList<Map<String,Object>>();
		Map<String,Object> map = new HashMap<String,Object>();
		String username =request.getParameter("username");
		String password =request.getParameter("password");
		Boolean ecist = this.userService.checkUser(username);
		if (!ecist) {
			map.put("code", 1);

			map.put("message", "用户不存在");
			message.add(map);
			return message;
		}
		User  user = this.userService.checkpassword(username, password);
		if (user== null) {
			map.put("code", 1);
			map.put("message", "用户密码错误存在");
			message.add(map);
			return message;	
		}
		request.setAttribute(ConstantUtil.CURRENT_USER, user);	
		map.put("code", 0);
		map.put("user", user);
		map.put("message", "登录成功");
		message.add(map);
		return message;
	}

}
