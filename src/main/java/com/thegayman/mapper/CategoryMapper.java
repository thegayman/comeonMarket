package com.thegayman.mapper;

import java.util.List;

import com.thegayman.model.Category;
import com.thegayman.model.CategorySecond;

/***
 * 一级目录
 * @author 物以类聚_LanCho
 *
 */
public interface CategoryMapper {

	public List<Category> findAllCategory();
	public List<CategorySecond> findSecondByCid(int cid);
}
