package com.cbgmall.mapper;

import java.util.List;

import com.cbgmall.domain.CategoryVO;
import com.cbgmall.domain.ProductVO;

public interface ProductMapper {

	// 1차카테고리
	public List<CategoryVO> getCategoryList() throws Exception;
	// 2차카테고리
	public List<CategoryVO> getSubCategoryList(String cg_code) throws Exception;
	
	public void product_insert(ProductVO vo) throws Exception;
}
