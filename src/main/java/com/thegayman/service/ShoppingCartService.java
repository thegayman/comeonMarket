package com.thegayman.service;

import org.springframework.stereotype.Service; 

import com.thegayman.model.ShoppingCart;
import com.thegayman.mapper.ShoppingCartMapper;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 购物车(shopping_cart
 * 
 * @author yesl 
 * @date 2017-07-27 11:07:10
 */

@Service
public class ShoppingCartService   {

	@Autowired
	private ShoppingCartMapper shoppingCartMapper;
	

}
