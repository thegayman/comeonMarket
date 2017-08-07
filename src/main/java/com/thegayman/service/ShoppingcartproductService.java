package com.thegayman.service;

import org.springframework.stereotype.Service;

import com.thegayman.model.Shoppingcartproduct;
import com.thegayman.mapper.ShoppingcartproductMapper;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 购物车商品(shoppingcartproduct)
 * 
 * @author yesl 
 * @date 2017-07-27 11:07:10
 */

@Service
public class ShoppingcartproductService   {

	@Autowired
	private ShoppingcartproductMapper shoppingcartproductMapper;
	

}
