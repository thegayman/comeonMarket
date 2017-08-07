package com.thegayman.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.core.annotation.Order;



/**
 * 订单项(orderitem)
 * 
 * @author yesl
 * @email liyq.qiji@foxmail.com
 * @date 2017-07-27 11:03:09
 */
 
 
public class OrderItem implements Serializable {
	private static final long serialVersionUID = 1L;	   
	private int itemId;
	private int count;                                         /*每件商品的购买数量*/
	private double itemTotal;                                  /*每件商品的数额*/
	private List<Product> plist = new ArrayList<Product>();    /*一个订单明细表可以有多个商品*/
	private Order order;                                       /*一个订单明细表只属于一个订单*/
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getItemTotal() {
		return itemTotal;
	}
	public void setItemTotal(double itemTotal) {
		this.itemTotal = itemTotal;
	}
	public List<Product> getPlist() {
		return plist;
	}
	public void setPlist(List<Product> plist) {
		this.plist = plist;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
	
}
