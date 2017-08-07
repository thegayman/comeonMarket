package com.thegayman.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.core.annotation.Order;



/**
 * 物流(logistics)
 * 
 * @author yesl
 * @email liyq.qiji@foxmail.com
 * @date 2017-07-27 11:03:09
 */
 
 
public class Logistics implements Serializable {
	private static final long serialVersionUID = 1L;

	private int logId;
	private String address;   //物流所到地址
	private Date time;        //物流更新时间
	private Order order;      //物流中的订单
	
	public int getLogId() {
		return logId;
	}
	public void setLogId(int logId) {
		this.logId = logId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
	
	
}
