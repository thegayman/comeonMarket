package com.thegayman.model;

import java.io.Serializable;
import java.util.Date; 
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;



/**
 * 购物车(shopping_cart
 * 
 * @author yesl
 * @email liyq.qiji@foxmail.com
 * @date 2017-07-27 11:03:09
 */
 
 
public class ShoppingCart implements Serializable {
	private static final long serialVersionUID = 1L;

 
	private String resourseid;//
	private Integer amount;//
	private Integer quantity;//
	private String userid;//

	/**
	 * 设置：
	 */
	public void setResourseid(String resourseid) {
		this.resourseid = resourseid;
	}
	/**
	 * 获取：
	 */
	public String getResourseid() {
		return resourseid;
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
	public void setUserid(String userid) {
		this.userid = userid;
	}
	/**
	 * 获取：
	 */
	public String getUserid() {
		return userid;
	}
}
