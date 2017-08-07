package com.thegayman.service;

import org.springframework.stereotype.Service;
 
import com.thegayman.mapper.LogisticsDetailMapper;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 物流信息(logistics_detail)
 * 
 * @author yesl 
 * @date 2017-07-27 11:07:10
 */

@Service
public class LogisticsDetailService   {

	@Autowired
	private LogisticsDetailMapper logisticsDetailMapper;
	

}
