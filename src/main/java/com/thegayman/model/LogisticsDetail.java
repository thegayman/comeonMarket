package com.thegayman.model;

import java.io.Serializable;
import java.util.Date; 
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;



/**
 * 物流信息(logistics_detail)
 * 
 * @author yesl
 * @email liyq.qiji@foxmail.com
 * @date 2017-07-27 11:03:09
 */
 
 
public class LogisticsDetail implements Serializable {
	private static final long serialVersionUID = 1L;

 
	private String resourceid;//
	private String logisticsid;//
	private String logisticsnnumber;//
	private String detail;//
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")//出
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")//进
	private Date date;//

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
	public void setLogisticsid(String logisticsid) {
		this.logisticsid = logisticsid;
	}
	/**
	 * 获取：
	 */
	public String getLogisticsid() {
		return logisticsid;
	}
	/**
	 * 设置：
	 */
	public void setLogisticsnnumber(String logisticsnnumber) {
		this.logisticsnnumber = logisticsnnumber;
	}
	/**
	 * 获取：
	 */
	public String getLogisticsnnumber() {
		return logisticsnnumber;
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
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * 获取：
	 */
	public Date getDate() {
		return date;
	}
}
