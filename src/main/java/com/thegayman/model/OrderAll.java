package com.thegayman.model;

import java.util.Date;

public class OrderAll {
	private int carId;
	private int count;                                          /*商品购买数量*/
	private double proPrice;                                    /*商品价格*/
	private int pid1;											/*商品id*/
	
	private int pid;
	private String pname;         /*商品名字*/
	private double market_price;  /*市场价*/
	private String pdesc;         /*商品描述*/
	private double shop_price;    /*商城价*/
	private String image;         /*商品图片*/
	private String is_hot;        /*是否是热门商品*/
	private Date pdate;           /*商品更新日期*/
	private int csid;   /*商品所属二级目录*/
	private int stock;   /*商品所属二级目录*/
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getProPrice() {
		return proPrice;
	}
	public void setProPrice(double proPrice) {
		this.proPrice = proPrice;
	}
	public int getPid1() {
		return pid1;
	}
	public void setPid1(int pid1) {
		this.pid1 = pid1;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getMarket_price() {
		return market_price;
	}
	public void setMarket_price(double market_price) {
		this.market_price = market_price;
	}
	public String getPdesc() {
		return pdesc;
	}
	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}
	public double getShop_price() {
		return shop_price;
	}
	public void setShop_price(double shop_price) {
		this.shop_price = shop_price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getIs_hot() {
		return is_hot;
	}
	public void setIs_hot(String is_hot) {
		this.is_hot = is_hot;
	}
	public Date getPdate() {
		return pdate;
	}
	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}
	public int getCsid() {
		return csid;
	}
	public void setCsid(int csid) {
		this.csid = csid;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	} 
	
}
