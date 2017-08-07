package com.thegayman.service;

import org.springframework.stereotype.Service;
 
import com.thegayman.mapper.OrderitemMapper;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 订单项(orderitem)
 * 
 * @author yesl 
 * @date 2017-07-27 11:07:10
 */

@Service
public class OrderitemService   {

	@Autowired
	private OrderitemMapper orderitemMapper;
	

}
