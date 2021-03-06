package com.cbgmall.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cbgmall.domain.CartVO;
import com.cbgmall.domain.CartVOList;
import com.cbgmall.dto.CartDTO;

public interface CartMapper {

	public void add_cart(CartVO vo) throws Exception;
	
	public List<CartVOList> list_cart(String mem_id) throws Exception;
	
	public void cartAll_delete(String mem_id) throws Exception;
	
	public void cart_amount_update(@Param("cart_code") int cart_code, @Param("cart_amount") int cart_amount) throws Exception;
	
	public void cart_check_delete(List<Integer> checkArr) throws Exception;
	
	public List<CartDTO> cart_money() throws Exception;
}
