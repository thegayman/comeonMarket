package com.thegayman.model;

import java.io.Serializable;
import java.util.Date; 
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;



/**
 * 商品(product)
 * 
 * @author yesl
 * @email liyq.qiji@foxmail.com
 * @date 2017-07-27 11:03:09
 */
 
 
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	 
	private String resourceid;//
	private String productname;//
	private Integer price;//
	private String detail;//
	private String classify;//
	private String productaddress;//
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
	public void setProductname(String productname) {
		this.productname = productname;
	}
	/**
	 * 获取：
	 */
	public String getProductname() {
		return productname;
	}
	/**
	 * 设置：
	 */
	public void setPrice(Integer price) {
		this.price = price;
	}
	/**
	 * 获取：
	 */
	public Integer getPrice() {
		return price;
	}
	/**
	 * 设置：
	 */
	public void setDetail(String detail) {
		this.detail = detail;
	}
	/**
	 * 获取：
	 */
	public String getDetail() {
		return detail;
	}
	/**
	 * 设置：
	 */
	public void setClassify(String classify) {
		this.classify = classify;
	}
	/**
	 * 获取：
	 */
	public String getClassify() {
		return classify;
	}
	/**
	 * 设置：
	 */
	public void setProductaddress(String productaddress) {
		this.productaddress = productaddress;
	}
	/**
	 * 获取：
	 */
	public String getProductaddress() {
		return productaddress;
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
