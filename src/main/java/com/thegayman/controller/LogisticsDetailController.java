package com.thegayman.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thegayman.service.LogisticsDetailService;
/**
 * 物流信息(logistics_detail)
 * 
 * @author yesl
 * @date 2017-07-27 11:07:10
 */
@RestController
@RequestMapping("logisticsdetail")
public class LogisticsDetailController {
 
	@Autowired
	private LogisticsDetailService logisticsDetailService;

	  
	
	
}
