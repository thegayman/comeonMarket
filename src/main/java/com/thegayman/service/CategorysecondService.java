package com.thegayman.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service; 

import com.thegayman.mapper.CategorysecondMapper;
import com.thegayman.model.CategorySecond;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * 
 * @author yesl 
 * @date 2017-08-07 21:12:22
 */

@Service
public class CategorysecondService   {

	@Autowired
	private CategorysecondMapper categorysecondMapper;

	public List<CategorySecond> querySecond(Integer cid) {
		// TODO Auto-generated method stub
		return this.categorysecondMapper.querySecond(cid);
	}
	

}
