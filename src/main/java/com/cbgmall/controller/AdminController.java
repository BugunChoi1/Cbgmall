package com.cbgmall.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cbgmall.domain.AdminVO;
import com.cbgmall.service.AdminService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/admin/*")
public class AdminController {

	@Setter(onMethod_ = @Autowired)
	private AdminService adminService;
	
	@GetMapping("")
	public String admin_main() {
		
		return "/admin/admin_login";
	}
	
	@PostMapping("/admin_check")
	public String amdin_ok(AdminVO vo, HttpSession session, RedirectAttributes rttr) throws Exception {
		
		
		log.info("admin_check: " + vo);
		
		AdminVO adVO = null;
		
		adVO = adminService.login_check(vo);
		
		if(adVO == null) {
			
			rttr.addFlashAttribute("msg", "Fail");
			return "redirect:/admin/";
		}
		
		// 세션인증작업
		session.setAttribute("adLoginStatus", adVO);
		
		return "redirect:/admin/admin_process";
	}
	
	@GetMapping("/admin_process")
	public String admin_process(HttpSession session) {
		
		log.info("admin_process");
		
		String url = "";
		
		if(session.getAttribute("adLoginStatus") == null) {
			url = "redirect:/admin/"; // 관리자로그인 주소
		}else {
			url = "/admin/admin_process"; // 관리자 메뉴 뷰(jsp)
		}
		
		return url; 
	
	}
	
	@PostMapping("/admin_logout")
	public String admin_logout(HttpSession session, RedirectAttributes rttr) {
		
		session.invalidate();
		
		rttr.addFlashAttribute("msg", "logout");
		return "redirect:/admin/";
	}
	
	
}
