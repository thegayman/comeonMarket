package com.thegayman.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.thegayman.model.Product;
import com.thegayman.mapper.ProductMapper;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 商品(product)
 * 
 * @author yesl
 * @date 2017-07-27 11:07:10
 */

@Service
public class ProductService {

	@Autowired
	private ProductMapper productMapper;

	// 查询首页热门商品
	public List<Product> findAllProductByHot() {
		return productMapper.findAllProductByHot();
	}

	// 查询首页最新商品
	public List<Product> findAllProductByTime() {
		return productMapper.findAllProductByTime();
	}

	// 查询商品详情
	public Product findProductById(int id) {
		return productMapper.findProductById(id);
	}

	// 根据一级目录查询商品
	public List<Product> findProductByCategory(int cid, int page1, int page2) {
		return productMapper.findProductByCategory(cid, page1, page2);
	}

	// 根据二级目录查询商品
	public List<Product> findProductByCategoryScond(int csid, int page1,
			int page2) {
		return productMapper.findProductByCategorySecond(csid, page1, page2);
	}

	public int querycountCategory(int cid) {
		return this.productMapper.querycountCategory(cid);
	}

	public int querycountCategorySecond(int csid) {
		return this.productMapper.querycountCategorySecond(csid);
	}
}
