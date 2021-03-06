package com.thegayman.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.thegayman.model.OrderAll;
import com.thegayman.model.Product;
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
	/**
	 * 加入购物车前的验证是否首次加入购物车
	 * @param shoppingCart
	 * @return
	 */
	public int addBefore(ShoppingCart shoppingCart);
	/**
	 * 加入购物车(非首次)
	 * @param shoppingCart
	 * @return
	 */
	public int update(ShoppingCart shoppingCart);
	/**
	 * 显示购物车所有信息
	 * @param uid
	 * @return
	 */
	public List<OrderAll> show(@Param("uid")int uid);
	/**
	 * 查询购物车所有商品数量
	 * @param id
	 * @return
	 */
	public int querycarcount(@Param("uid")int uid);
	/**
	 * 根据订单id删除购物车内容
	 * @param oid
	 * @return
	 */
	public int del(@Param("oid")int oid,@Param("pid")int pid);
}
