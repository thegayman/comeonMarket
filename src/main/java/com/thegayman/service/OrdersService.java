package com.thegayman.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.thegayman.model.OrderItem;
import com.thegayman.model.Orders;
import com.thegayman.mapper.OrderitemMapper;
import com.thegayman.mapper.OrdersMapper;
import com.thegayman.mapper.ShoppingCartMapper;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * order
 * 
 * @author yesl
 * @date 2017-07-27 11:07:10
 */

@Service
public class OrdersService {

	@Autowired
	private OrdersMapper ordersMapper;
	@Autowired
	private OrderitemMapper orderitemMapper;
	@Autowired
	private ShoppingCartMapper shoppingCartMapper;
	/**
	 * 加入订单详情,再加入订单
	 * @param order
	 * @param orderList
	 */
	public void save(Orders order,List<OrderItem> orderList) {
		// TODO Auto-generated method stub
		this.ordersMapper.insert(order);
		this.orderitemMapper.insert(orderList);
		shoppingCartMapper.del(order.getOid(),order.getPid());
	}

	public List<Orders> queryByUserId(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	public int deleteByIds(String[] ids) {
		// TODO Auto-generated method stub
		return this.ordersMapper.deleteByIds(ids);
	}

}
