package com.thegayman.model;

import java.io.Serializable;
import java.util.Date; 
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;



/**
 * 订单项(orderitem)
 * 
 * @author yesl
 * @email liyq.qiji@foxmail.com
 * @date 2017-07-27 11:03:09
 */
 
 
public class Orderitem implements Serializable {
	private static final long serialVersionUID = 1L;

	 
	private String resourceid;//
	private String orderid;//
	private String productid;//
	private Integer quantity;//
	private Double amount;//
	private Double price;//

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
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	/**
	 * 获取：
	 */
	public String getOrderid() {
		return orderid;
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
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	/**
	 * 获取：
	 */
	public Double getAmount() {
		return amount;
	}
	/**
	 * 设置：
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	/**
	 * 获取：
	 */
	public Double getPrice() {
		return price;
	}
}
