package com.cbgmall.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cbgmall.domain.OrderDetailListVO;
import com.cbgmall.dto.Criteria;
import com.cbgmall.dto.PageDTO;
import com.cbgmall.service.OrderService;
import com.cbgmall.util.FileUploadUtils;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/admin/order/*")
@Log4j
public class AdOrderController {

	
	@Setter(onMethod_ = @Autowired)
	private OrderService orderService;
	
	@Resource(name="uploadPath")
	private String uploadPath;
	
	//@RequestMapping(value = { "/order_list", "/order_detail_list" }, method = {RequestMethod.GET, RequestMethod.POST})
	@RequestMapping(value = "/order_list", method = {RequestMethod.GET, RequestMethod.POST})
	public void order_list(@ModelAttribute("cri") Criteria cri, Model model) throws Exception{
		
		log.info("order_list: " + cri);
		
		model.addAttribute("order_list", orderService.orderInfo_list(cri));
		
		int total = orderService.getTotalCountOrder(cri);
		
		model.addAttribute("pageMaker", new PageDTO(cri, total));
	}
	
	// ajax에서 넘어온 주문번호 파라미터를 가지고 주문상세테이블에 쿼리를 구성해야 한다.
	
	@GetMapping("/order_detail_list")
	@ResponseBody
	public ResponseEntity<List<OrderDetailListVO>> order_detail_list(long odr_code) throws Exception{
		
		ResponseEntity<List<OrderDetailListVO>> entity = null;
		
		try {
			entity = new ResponseEntity<List<OrderDetailListVO>>(orderService.order_detail_list(odr_code), HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<List<OrderDetailListVO>>(HttpStatus.BAD_REQUEST);
		}

		return entity;
	}
	
	//상품이미지 뷰
	@ResponseBody
	@GetMapping("/displayFile")
	public ResponseEntity<byte[]> displayFile(String fileName) throws Exception{
		
		
		return FileUploadUtils.getFile(uploadPath, fileName);
	}
	
	//매출통계
	@GetMapping("/order_sale")
	public void order_sale(Model model, @RequestParam(required = false) Integer year, @RequestParam(required = false) Integer month) throws Exception{
		
		log.info("order_sale");
		
		// 월별 시작일,말일 구하기
		Calendar cal = Calendar.getInstance();
		
		log.info(cal);
		
		int cur_year;
		int cur_month;
		
		if(year != null && month != null) {
			cur_year = (int) year;
			cur_month = ((int) month) - 1;  // 클라이언트에서 전송된 값은 4월 선택시 4-1로처리해야 한다.
		}else {
			cur_year = cal.get(Calendar.YEAR);
			cur_month = cal.get(Calendar.MONTH);
		}
		
		model.addAttribute("sel_year", cur_year);
		model.addAttribute("sel_month", cur_month+1);
		
		
		log.info("sel_year: " + cur_year);
		log.info("sel_month: " + cur_month+1);
		
		cal.set(cur_year, cur_month, 1); // 월 0~11 : 
		
		
		
		log.info("기준날짜: " + cal);
				
		int start_day = cal.getActualMinimum(Calendar.DAY_OF_MONTH);
		int end_day = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA);
		cal.set(cur_year, cur_month, start_day);
		
		String startDate = dateFormat.format(cal.getTime());
		cal.set(cur_year, cur_month, end_day);
		String endDate = dateFormat.format(cal.getTime());
		
		log.info("시작일: " + startDate); // 시작일: 2021-04-01
		log.info("말일: " + endDate); // 말일: 2021-04-30
		
		model.addAttribute("order_salelist", orderService.order_sale("2006-01-01", "2006-01-30"));
		//model.addAttribute("order_salelist", orderService.order_sale(startDate, endDate));
	}
}
