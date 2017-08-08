package com.thegayman.model;


/***
 * 二级目录表
 * @author 物以类聚_LanCho
 *
 */
public class CategorySecond {

	private Integer csid;
	private String csname;    //二级目录名称
	private Integer cid; //所属一级目录
	
	public Integer getCsid() {
		return csid;
	}
 
	public String getCsname() {
		return csname;
	}
	public void setCsname(String csname) {
		this.csname = csname;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public void setCsid(Integer csid) {
		this.csid = csid;
	}
	 
	
	
}
