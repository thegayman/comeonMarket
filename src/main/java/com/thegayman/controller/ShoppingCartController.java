package com.thegayman.controller;

import java.util.Date;
import java.util.List;  

import com.thegayman.model.ShoppingCart;
import com.thegayman.service.ShoppingCartService;

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
 * 购物车(shopping_cart
 * 
 * @author yesl
 * @date 2017-07-27 11:07:10
 */
@RestController
@RequestMapping("Restful")
public class ShoppingCartController {
 
	@Autowired
	private ShoppingCartService shoppingCartService;

	/**
	 * 按id查询数据
	 * 
	 * @author qiji
	 * @email liyq.qiji@foxmail.com
	 * @date 2017-04-26 09:06:28
	 */
	@RequestMapping(value = "message", method = RequestMethod.GET)
	public String info() {
		String message = "显示成功";
		return message;

	}
}
