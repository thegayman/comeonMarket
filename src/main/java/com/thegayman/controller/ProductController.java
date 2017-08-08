package com.thegayman.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;  
import java.util.Map;

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
	public Product findProductById(HttpServletRequest request){
		String pid =request.getParameter("pid");
		return productService.findProductById(Integer.parseInt(pid));
	}
	
	
	//根据二级目录查询商品
	@RequestMapping("/findByCategory")
	public  List<Map<String, Object>> findProductByCategory(HttpServletRequest request){
		List<Map<String, Object>> maps = new ArrayList<Map<String, Object>>();
		
		String cid =request.getParameter("cid");
		String csid =request.getParameter("csid");
		String pageindex =request.getParameter("pageindex"); 
		Integer page = 1;
		if (pageindex !=null && StringUtils.isNoneBlank(pageindex)) {
			page = Integer.parseInt(pageindex);
		}
		
		int page1 = (page-1)*12;
		int page2 = (page)*12;
		Map<String, Object> map= new HashMap<String, Object>();
		
		if(cid!=null && StringUtils.isNoneBlank(cid)){
			
			  map.put("list",   productService.findProductByCategory(Integer.parseInt(cid),page1,page2)) ;
			  map.put("pagerNum", productService.querycountCategory(Integer.parseInt(cid)))	;
		}
		if(csid!=null && StringUtils.isNoneBlank(csid)){ 
			  map.put("list",   productService.findProductByCategoryScond(Integer.parseInt(csid),page1,page2)) ;
			  map.put("pagerNum", productService.querycountCategorySecond(Integer.parseInt(csid)))	;
		}
		maps.add(map);
		return maps;
	}	
}
