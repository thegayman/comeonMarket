package com.thegayman.model;

import java.io.Serializable;
import java.util.Date; 
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;



/**
 * 物流(logistics)
 * 
 * @author yesl
 * @email liyq.qiji@foxmail.com
 * @date 2017-07-27 11:03:09
 */
 
 
public class Logistics implements Serializable {
	private static final long serialVersionUID = 1L;

 
	private String resourceid;//
	private String orderid;//
	private String addres;//
	private String recipient;//
	private String shipaddress;//
	private String consigner;//
	private String company;//
	private String statu;//
	private String recipientphone;//
	private String consignerphone;//

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
	public void setAddres(String addres) {
		this.addres = addres;
	}
	/**
	 * 获取：
	 */
	public String getAddres() {
		return addres;
	}
	/**
	 * 设置：
	 */
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	/**
	 * 获取：
	 */
	public String getRecipient() {
		return recipient;
	}
	/**
	 * 设置：
	 */
	public void setShipaddress(String shipaddress) {
		this.shipaddress = shipaddress;
	}
	/**
	 * 获取：
	 */
	public String getShipaddress() {
		return shipaddress;
	}
	/**
	 * 设置：
	 */
	public void setConsigner(String consigner) {
		this.consigner = consigner;
	}
	/**
	 * 获取：
	 */
	public String getConsigner() {
		return consigner;
	}
	/**
	 * 设置：
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
	 * 获取：
	 */
	public String getCompany() {
		return company;
	}
	/**
	 * 设置：
	 */
	public void setStatu(String statu) {
		this.statu = statu;
	}
	/**
	 * 获取：
	 */
	public String getStatu() {
		return statu;
	}
	/**
	 * 设置：
	 */
	public void setRecipientphone(String recipientphone) {
		this.recipientphone = recipientphone;
	}
	/**
	 * 获取：
	 */
	public String getRecipientphone() {
		return recipientphone;
	}
	/**
	 * 设置：
	 */
	public void setConsignerphone(String consignerphone) {
		this.consignerphone = consignerphone;
	}
	/**
	 * 获取：
	 */
	public String getConsignerphone() {
		return consignerphone;
	}
}
