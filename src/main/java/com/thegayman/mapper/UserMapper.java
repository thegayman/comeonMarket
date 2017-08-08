package com.thegayman.mapper;

import org.apache.ibatis.annotations.Param;

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
	/**
	 * 保存用户
	 * @param user
	 */
	public int checkUserExis(@Param("username")String username);
	/**
	 * 保存用户
	 * @param user
	 */
	public User checkpassword(@Param("username")String username,@Param("password")String password);
} 
