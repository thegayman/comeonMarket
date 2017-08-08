package com.thegayman.mapper;

import com.thegayman.model.ShoppingCart;

/**
 * 购物车(shopping_cart
 * 
 * @author yesl 
 * @date 2017-07-27 11:07:10
 */
public interface ShoppingCartMapper  {
	/**
	 * 加入购物车(首次)
	 * @param shoppingCart
	 * @return
	 */
	public int add(ShoppingCart shoppingCart);
	public int addBefore(ShoppingCart shoppingCart);
	public int update(ShoppingCart shoppingCart);
}
