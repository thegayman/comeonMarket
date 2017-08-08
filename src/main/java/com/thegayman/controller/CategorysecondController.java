package com.thegayman.controller;
 
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import com.thegayman.model.Category;
import com.thegayman.model.CategorySecond;
import com.thegayman.service.CategoryService;
import com.thegayman.service.CategorysecondService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController; 
import org.springframework.web.bind.annotation.RequestMapping; 







import javax.servlet.http.HttpServletRequest;
/**
 * 
 * 
 * @author yesl
 * @date 2017-08-07 21:12:22
 */
@RestController
@RequestMapping("categorysecond")
public class CategorysecondController {
 
	@Autowired
	private CategorysecondService categorysecondService;

	@Autowired
	private CategoryService categoryService;
	 //查询商品一级分类
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public List<Map<String, Object>> list(){
		List<Map<String, Object>> maps = new ArrayList<Map<String, Object>>();
		List<Category> firstCategory =categoryService.queryAll();
		for(Category category :firstCategory){
			Map<String, Object> map= new HashMap<String, Object>();
			map.put("firstname", category.getCname());
			map.put("cid", category.getCid());
			List<CategorySecond> secondCategory = categorysecondService.querySecond(category.getCid());
			List<Map<String, Object>> scondname = new ArrayList<Map<String, Object>>();
			for(CategorySecond categorySecond :secondCategory){
				Map<String, Object> secondmap= new HashMap<String, Object>();
				secondmap.put("secon", categorySecond.getCsname());
				secondmap.put("csid", categorySecond.getCsid());
				scondname.add(secondmap);
			}
			map.put("scondname", scondname);
			maps.add(map);
		}	
		return maps;
	}
}
