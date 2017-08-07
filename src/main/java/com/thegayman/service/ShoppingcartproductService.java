package com.thegayman.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thegayman.mapper.ShoppingcartproductMapper;

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
