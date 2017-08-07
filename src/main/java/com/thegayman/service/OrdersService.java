package com.thegayman.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.thegayman.model.Orders;
import com.thegayman.mapper.OrdersMapper;

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

	public void save(Orders order) {
		// TODO Auto-generated method stub
		this.ordersMapper.insert();
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
