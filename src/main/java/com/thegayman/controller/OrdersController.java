package com.thegayman.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.thegayman.model.Orders;
import com.thegayman.model.Shoppingcartproduct;
import com.thegayman.model.User;
import com.thegayman.service.OrdersService;
import com.thegayman.service.ShoppingcartproductService;
import com.thegayman.utils.ConstantUtil;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * order
 * 
 * @author yesl
 * @date 2017-07-27 11:07:10
 */
@RestController
@RequestMapping("orders")
public class OrdersController {

	@Autowired
	private OrdersService ordersService;
	private ObjectMapper MAPPER = new ObjectMapper();
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public List<Orders> list(HttpServletRequest request) {
		//根据用户id获取订单信息
		String userid = request.getParameter("userid");
	List<Orders> orders= ordersService.queryByUserId(userid);	
				
		return orders;
	}

	/**
	 * 开启线程处理订单
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public void save(HttpServletRequest request) {
		try {
			String param = request.getParameter("order");
			Thread thread = new Thread(new deal(param));
			thread.start();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@RequestMapping(value = "delete", method = RequestMethod.POST)
	public Integer delete(HttpServletRequest request) {
		
		try {
			String param = request.getParameter(ConstantUtil.PARAM_NAME);
			String[] array = MAPPER.readValue(param,String[].class);
			if (array!=null&&array.length>0) {
				int x = ordersService.deleteByIds(array);
				}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		return null;
	}

	/**
	 * 处理订单线程
	 * 
	 * @author ye
	 *
	 */
	class deal implements Runnable {
		String param;

		public deal(String param) {
			this.param = param;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				Orders	order = MAPPER.readValue(param, Orders.class);
				 ordersService.save(order);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		
		}

	}
}
