package com.thegayman.controller;

import java.util.Date;
import java.util.List;  

import com.thegayman.model.Product;
import com.thegayman.service.ProductService;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;






import javax.servlet.http.HttpServletRequest;
/**
 * 商品(product)
 * 
 * @author yesl
 * @date 2017-07-27 11:07:10
 */
@RestController
@RequestMapping("/product") 
public class ProductController {
 
	@Autowired
	private ProductService productService;
	
	//查询首页热门商品
	@RequestMapping(value="/findAllByHot", method = RequestMethod.GET)
	public List<Product> findAllProductByHot(){
		return productService.findAllProductByHot();
	}
	
	
	//查询首页最新商品
	@RequestMapping("/findAllByTime")
	public List<Product> findAllProductByTime(){
		return productService.findAllProductByTime();
	}
	
	
	//查询商品详情
	@RequestMapping("/findById")
	public Product findProductById(int pid){
		return productService.findProductById(pid);
	}
	
	
	//根据二级目录查询商品
	@RequestMapping("/findByCategory")
	public List<Product> findProductByCategory(HttpServletRequest request){
		String cid =request.getParameter("cid");
		String csid =request.getParameter("csid");
		if(cid!=null && StringUtils.isNoneBlank(cid)){
			return productService.findProductByCategory(Integer.parseInt(cid) );
		}
		if(csid!=null && StringUtils.isNoneBlank(csid)){
			return productService.findProductByCategory(Integer.parseInt(csid) );
		}
		return null;
	}
		

	
}
