package com.thegayman.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;

import java.util.Map;
import java.util.Random;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.thegayman.model.User;
import com.thegayman.service.UserService;

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
	public String login(HttpServletRequest request){
		return "1";
	}

}
