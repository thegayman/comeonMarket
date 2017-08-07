package com.thegayman.model;

import java.util.ArrayList;
import java.util.List;

/***
 * 一级目录表
 * @author 物以类聚_LanCho
 *
 */
public class Category {

	private int cid;
	private String cname;    //一级目录名称
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}

	
	
}
