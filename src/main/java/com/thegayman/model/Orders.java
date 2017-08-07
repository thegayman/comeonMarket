package com.thegayman.model;

import java.io.Serializable;
import java.util.Date; 
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;



/**
 * order
 * 
 * @author yesl
 * @email liyq.qiji@foxmail.com
 * @date 2017-07-27 11:03:09
 */
 
 
public class Orders implements Serializable {
	private static final long serialVersionUID = 1L;

	 
	private String resourceid;//
	private String orderNumber;//
	private String userid;//
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")//出
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")//进
	private Date orderDate;//
	private String status;//
	private String address;//
	private Double carriage;//

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
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	/**
	 * 获取：
	 */
	public String getOrderNumber() {
		return orderNumber;
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
	/**
	 * 设置：
	 */
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	/**
	 * 获取：
	 */
	public Date getOrderDate() {
		return orderDate;
	}
	/**
	 * 设置：
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * 获取：
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * 设置：
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 获取：
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 设置：
	 */
	public void setCarriage(Double carriage) {
		this.carriage = carriage;
	}
	/**
	 * 获取：
	 */
	public Double getCarriage() {
		return carriage;
	}
}
