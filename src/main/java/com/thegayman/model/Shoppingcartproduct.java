package com.thegayman.model;

import java.io.Serializable;
import java.util.Date; 
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;



/**
 * 购物车商品(shoppingcartproduct)
 * 
 * @author yesl
 * @email liyq.qiji@foxmail.com
 * @date 2017-07-27 11:03:09
 */
 
 
public class Shoppingcartproduct implements Serializable {
	private static final long serialVersionUID = 1L;

	 
	private String resourceid;//
	private String shoppingcartid;//
	private String productid;//
	private Integer quantity;//
	private Integer amount;//

	/**
	 * 设置：
	 */
	public void setResourceid(String resourceid) {
		this.resourceid = resourceid;
	}
	/**
	 * 获取：
	 */
	public String getResourceid() {
		return resourceid;
	}
	/**
	 * 设置：
	 */
	public void setShoppingcartid(String shoppingcartid) {
		this.shoppingcartid = shoppingcartid;
	}
	/**
	 * 获取：
	 */
	public String getShoppingcartid() {
		return shoppingcartid;
	}
	/**
	 * 设置：
	 */
	public void setProductid(String productid) {
		this.productid = productid;
	}
	/**
	 * 获取：
	 */
	public String getProductid() {
		return productid;
	}
	/**
	 * 设置：
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	/**
	 * 获取：
	 */
	public Integer getQuantity() {
		return quantity;
	}
	/**
	 * 设置：
	 */
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	/**
	 * 获取：
	 */
	public Integer getAmount() {
		return amount;
	}
}
