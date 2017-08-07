package com.thegayman.mapper;

import org.apache.ibatis.annotations.Param;
 

/**
 * order
 * 
 * @author yesl 
 * @date 2017-07-27 11:07:10
 */
public interface OrdersMapper  {

	void insert();
	
	/**
	 * 按id一次删除多条数据
	 * 
	 */
	public int deleteByIds(@Param("ids") String[] ids);

}
