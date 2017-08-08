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
	/**
	 * 商品加入购物车,如果商品已经存在,更新数据,否则加入数据行
	 * @param shoppingCart
	 * @return
	 */
	public int add(ShoppingCart shoppingCart) {
		if(shoppingCartMapper.addBefore(shoppingCart)>0) {
			return shoppingCartMapper.update(shoppingCart);
		}else {
			return shoppingCartMapper.add(shoppingCart);
		}
	}

}
