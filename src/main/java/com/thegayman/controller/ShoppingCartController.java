package com.thegayman.controller;

import com.thegayman.model.OrderAll;
import com.thegayman.model.Product;
import com.thegayman.model.ShoppingCart;
import com.thegayman.service.ShoppingCartService;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
/**
 * 购物车(shopping_cart
 * 
 * @author yesl
 * @date 2017-07-27 11:07:10
 */
@RestController
@RequestMapping("shopcar")
public class ShoppingCartController {
 
	@Autowired
	private ShoppingCartService shoppingCartService;
	 private ObjectMapper MAPPER = new ObjectMapper();
	/**
	 * 商品加入购物车
	 * 
	 * @author qiji
	 * @email liyq.qiji@foxmail.com
	 * @date 2017-04-26 09:06:28
	 */
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public int add(HttpServletRequest request) {
		ShoppingCart shoppingCart=new ShoppingCart();
		String parms=(String) request.getParameter("ShoppingCart");
		try {
			shoppingCart = MAPPER.readValue(parms, ShoppingCart.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return shoppingCartService.add(shoppingCart);
	}
	/**
	 * 通过用户id显示所有的购物车信息
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "show", method = RequestMethod.POST)
	public List<OrderAll> show(HttpServletRequest request) {
		int uid=0;
		String parms=request.getParameter("uid");
		try {
			uid = MAPPER.readValue(parms, Integer.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return shoppingCartService.show(uid);
	}
	@RequestMapping(value = "querycount", method = RequestMethod.POST)
	public int querycarcount(HttpServletRequest request) {
		int uid=0;
		String parms=request.getParameter("uid");
		try {
			uid = MAPPER.readValue(parms, Integer.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return shoppingCartService.querycarcount(uid);
	}
}
