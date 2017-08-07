package com.thegayman.service;

import java.util.List;

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
	//查询首页展示商品
	public List<Product> findAllProduct(){
		return productMapper.findAllProduct();
	}
	
	
	//查询商品详情
	public Product findProductById(int id){
		return productMapper.findProductById(id);
	}
	
	
	//根据一级目录查询商品
	public List<Product> findProductByCategory(int cid){
		return productMapper.findProductByCategory(cid);
	}
	

}
