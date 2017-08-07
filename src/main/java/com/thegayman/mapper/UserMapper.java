package com.thegayman.mapper;

import com.thegayman.model.User;  

/**
 * 用户表(user)
 * 
 * @author yesl 
 * @date 2017-07-27 11:07:10
 */
public interface UserMapper  {
	/**
	 * 保存用户
	 * @param user
	 */
	public void insert(User user);
} 
