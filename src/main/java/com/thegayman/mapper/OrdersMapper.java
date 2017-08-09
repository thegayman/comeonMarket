package com.thegayman.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.thegayman.model.OrderItem;
import com.thegayman.model.Orders;
 

/**
 * order
 * 
 * @author yesl 
 * @date 2017-07-27 11:07:10
 */
public interface OrdersMapper  {

	void insert(Orders order);
	
	/**
	 * 按id一次删除多条数据
	 * 
	 */
	public int deleteByIds(@Param("ids") String[] ids);
	
	

}
