package com.thegayman.service;

import org.springframework.stereotype.Service;
 
import com.thegayman.mapper.LogisticsMapper;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 物流(logistics)
 * 
 * @author yesl 
 * @date 2017-07-27 11:07:10
 */

@Service
public class LogisticsService  {

	@Autowired
	private LogisticsMapper logisticsMapper;
	

}
