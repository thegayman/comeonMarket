package com.thegayman.service;

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
	

}
