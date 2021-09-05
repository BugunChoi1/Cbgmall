package com.cbgmall.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cbgmall.domain.OrderDetailListVO;
import com.cbgmall.domain.OrderDetailVO;
import com.cbgmall.domain.OrderVO;
import com.cbgmall.dto.Criteria;
import com.cbgmall.dto.OrderSaleDTO;

public interface OrderService {

	public void order_buy(OrderVO vo, String mem_id) throws Exception;
	
	public void orderDirect_buy(OrderVO vo,OrderDetailVO vo2) throws Exception;
	
	//주문리스트
	public List<OrderVO> orderInfo_list(Criteria cri) throws Exception;
	
	//주문상품개수(페이징기능에 사용)
	public int getTotalCountOrder(Criteria cri) throws Exception;
	
	public List<OrderDetailListVO> order_detail_list(long odr_code) throws Exception;
	
	public List<OrderSaleDTO> order_sale(String startDate,  String endDate) throws Exception;
}
