package com.thegayman.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thegayman.model.Category;
import com.thegayman.model.CategorySecond;
import com.thegayman.service.CategoryService;
/***
 * 一级目录controller
 * @author 物以类聚_LanCho
 *
 */
@RestController
@RequestMapping("category")
@Controller
public class CategoryController {
 
	@Autowired
	private CategoryService categoryService;
	
	/**
	 * 查询所有的一级目录
	 * @return
	 */
	@RequestMapping("/findAllCategory")
	public List<Category> findAllCategory(){
		return categoryService.findAllCategory();
	}

	
	/***
	 * 根据一级目录查询二级目录
	 *
	 */
	@RequestMapping("/findSecondByCid")
	public List<CategorySecond> findSecondByCid(int cid){
		return categoryService.findSecondByCid(cid);
	}
	 //查询商品一级分类
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public List<Category> list(){
		return categoryService.queryAll();
	}
}
