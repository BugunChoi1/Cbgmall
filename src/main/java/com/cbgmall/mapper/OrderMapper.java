package com.cbgmall.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cbgmall.domain.CartVOList;
import com.cbgmall.domain.OrderDetailListVO;
import com.cbgmall.domain.OrderDetailVO;
import com.cbgmall.domain.OrderVO;
import com.cbgmall.domain.ProductVO;
import com.cbgmall.dto.Criteria;
import com.cbgmall.dto.OrderSaleDTO;

public interface OrderMapper {

	// 주문정보
	public void order_add(OrderVO vo) throws Exception;
	// 주문상세정보(주문내역)
	public void orderDetail_add(@Param("odr_code") long odr_code, @Param("mem_id") String mem_id) throws Exception;
	
	public void orderDirect_add(OrderDetailVO vo) throws Exception;
	
	//주문리스트
	public List<OrderVO> orderInfo_list(Criteria cri) throws Exception;
	
	//주문상품개수(페이징기능에 사용)
	public int getTotalCountOrder(Criteria cri) throws Exception;
	
	public List<OrderDetailListVO> order_detail_list(long odr_code) throws Exception;
	
	public List<OrderSaleDTO> order_sale(@Param("startDate") String startDate,  @Param("endDate") String endDate) throws Exception;	
	
	
	
	
	
}
