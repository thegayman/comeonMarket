package com.thegayman.service;

import org.springframework.stereotype.Service;

import com.thegayman.model.User;
import com.thegayman.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 用户表(user)
 * 
 * @author yesl
 * @date 2017-07-27 11:07:10
 */

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;

	/**
	 * 保存用户
	 * @param user
	 */
	public void save(User user) {
		this.userMapper.insert(user);;
	}
	
	public Boolean checkUser(String username){
		int num = this.userMapper.checkUserExis(username);
		return num>0?true:false;
	}
	
	public User checkpassword(String username ,String password){
		return this.userMapper.checkpassword(username, password) ;
	}
}
