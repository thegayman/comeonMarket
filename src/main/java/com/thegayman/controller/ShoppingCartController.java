package com.thegayman.controller;

import com.thegayman.model.ShoppingCart;
import com.thegayman.service.ShoppingCartService;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




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
}
