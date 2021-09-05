package com.cbgmall.service;

import com.cbgmall.domain.ReviewVO;
import com.cbgmall.dto.Criteria;
import com.cbgmall.dto.ReviewPageDTO;

public interface ReviewService {

	public ReviewPageDTO getReviewListWithPaging(Criteria cri, int pdt_num) throws Exception;
	
	public void review_register(ReviewVO vo) throws Exception;
	
	public void review_modify(ReviewVO vo) throws Exception;
	
	public void review_delete(int rv_num) throws Exception;
}
