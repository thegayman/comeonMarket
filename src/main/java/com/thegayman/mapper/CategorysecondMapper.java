package com.thegayman.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.thegayman.model.CategorySecond;  

/**
 * 
 * 
 * @author yesl 
 * @date 2017-08-07 21:12:22
 */
public interface CategorysecondMapper  {

	List<CategorySecond> querySecond(@Param("cid")Integer cid);
	
 
}
