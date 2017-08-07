package com.thegayman.controller;

import java.util.Date;
import java.util.List;

import com.thegayman.model.Shoppingcartproduct;
import com.thegayman.service.ShoppingcartproductService;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * 购物车商品(shoppingcartproduct)
 * 
 * @author yesl
 * @date 2017-07-27 11:07:10
 */
@RestController
@RequestMapping("shoppingcartproduct")
public class ShoppingcartproductController {

	@Autowired
	private ShoppingcartproductService shoppingcartproductService;

	@RequestMapping(value = "list", method = RequestMethod.GET)
	public Shoppingcartproduct list(HttpServletRequest request) {
		return new Shoppingcartproduct();
	}

	@RequestMapping(value = "save", method = RequestMethod.POST)
	public Integer save(HttpServletRequest request) {
		return null;
	}

	@RequestMapping(value = "delete",method = RequestMethod.POST)
	public Integer delete( HttpServletRequest request) {
		return null;
	}
 

}
