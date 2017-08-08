package com.thegayman.model;


/***
 * 二级目录表
 * @author 物以类聚_LanCho
 *
 */
public class CategorySecond {

	private int csid;
	private String csname;    //二级目录名称
	private Category category; //所属一级目录
	
	public int getCsid() {
		return csid;
	}
	public void setCsid(int csid) {
		this.csid = csid;
	}
	public String getCsname() {
		return csname;
	}
	public void setCsname(String csname) {
		this.csname = csname;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	
}
