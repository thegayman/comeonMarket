package com.thegayman.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



/**
 * 购物车(shopping_cart
 * 
 * @author yesl
 * @email liyq.qiji@foxmail.com
 * @date 2017-07-27 11:03:09
 */
 
 
public class ShoppingCart implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int carId;
	private int count;                                          /*商品购买数量*/
	private double proPrice;                                    /*商品价格*/
	private List<Product> plist = new ArrayList<Product>();     /*一个购物车里可以有多个商品*/
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getProPrice() {
		return proPrice;
	}
	public void setProPrice(double proPrice) {
		this.proPrice = proPrice;
	}
	public List<Product> getPlist() {
		return plist;
	}
	public void setPlist(List<Product> plist) {
		this.plist = plist;
	}
	
}
