package com.cbgmall.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cbgmall.domain.CategoryVO;
import com.cbgmall.domain.ProductVO;
import com.cbgmall.dto.Criteria;

public interface UserProductService {
	
	// 1차카테고리
	public List<CategoryVO> getCategoryList() throws Exception;
	// 2차카테고리
	public List<CategoryVO> getSubCategoryList(String cg_code) throws Exception;
	
	//2차카테고리에 해당하는 상품목록
	public List<ProductVO> getProductListBysubCate(Criteria cri,String cg_code) throws Exception;
	
	public int getTotalCountProductBySubCate(String cg_code) throws Exception;
	
	public ProductVO getProductByNum(long pdt_num) throws Exception;

}
