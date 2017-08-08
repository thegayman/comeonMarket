package com.thegayman.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thegayman.mapper.CategoryMapper;
import com.thegayman.model.Category;
import com.thegayman.model.CategorySecond;

/***
 * 一级目录service
 * @author 物以类聚_LanCho
 *
 */
@Service
public class CategoryService {

	@Autowired
	private CategoryMapper categorymapper;
	/**
	 * 查询所有的一级目录
	 * @return
	 */
	public List<Category> findAllCategory(){	
		return categorymapper.findAllCategory();
	}
	
	/***
	 * 根据一级目录查询二级目录
	 *
	 */
	public List<CategorySecond> findSecondByCid(int cid){
		return categorymapper.findSecondByCid(cid);
	}

	public List<Category> queryAll() {
		// TODO Auto-generated method stub
		return this.categorymapper.queryAll();
	}
	
}
