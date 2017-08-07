package com.thegayman.mapper;

import java.util.List;

import com.thegayman.model.Product;
 
/**
 * 商品(product)
 * 
 * @author yesl 
 * @date 2017-07-27 11:07:10
 */
public interface ProductMapper  {
	
	public List<Product> findAllProduct();
	public Product findProductById(int id);
	public List<Product> findProductByCategory(int cid);
}
