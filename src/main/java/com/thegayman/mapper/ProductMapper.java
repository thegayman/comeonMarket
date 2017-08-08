package com.thegayman.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.thegayman.model.Product;
 
/**
 * 商品(product)
 * 
 * @author yesl 
 * @date 2017-07-27 11:07:10
 */
public interface ProductMapper  {
	
	public List<Product> findAllProductByHot();
	public List<Product> findAllProductByTime();
	public Product findProductById(int id);
	public List<Product> findProductByCategory(@Param("cid")int cid, @Param("page1")int page1,@Param("page2") int page2);
	public List<Product> findProductByCategorySecond( @Param("csid")int csid,@Param("page1") int page1,@Param("page2") int page2);
    public  int querycountCategory(@Param("cid")int cid);
    public  int querycountCategorySecond(@Param("csid")int csid);
    
}
