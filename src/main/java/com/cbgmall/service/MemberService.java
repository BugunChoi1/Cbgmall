package com.cbgmall.service;

import java.util.List;

import com.cbgmall.domain.MemberVO;
import com.cbgmall.domain.UserInfoVO;
import com.cbgmall.dto.LoginDTO;

public interface MemberService {

	//회원가입 저장
	public void join(MemberVO vo) throws Exception;
	
	public int checkIdDuplicate(String mem_id) throws Exception;
	
	public MemberVO login_ok(LoginDTO dto) throws Exception;
	
	// 회원수정 폼
	public MemberVO member_info(String mem_id) throws Exception;
	
	//회원수정 저장
	public boolean modifyPOST(MemberVO vo) throws Exception;
	
	//회원삭제
	public void member_delete(String mem_id) throws Exception;
	
	//아이디 찾기 : 화면출력
	public String find_id(String mem_name) throws Exception;
	
	//비밀번호 찾기
	public MemberVO find_pwd(String mem_id, String mem_name) throws Exception;
	
	public List<UserInfoVO> userinfo_list() throws Exception;
	
	// 난수발생한 비번 업데이트
	public void update_pwd(LoginDTO dto) throws Exception;
}
