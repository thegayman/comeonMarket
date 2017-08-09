package com.thegayman.mapper;

import java.util.List;

import com.thegayman.model.OrderItem;

/**
 * 订单项(orderitem)
 * 
 * @author yesl 
 * @date 2017-07-27 11:07:10
 */
public interface OrderitemMapper  {
	int insert(List<OrderItem> list);
}
