package com.cbgmall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cbgmall.domain.MemberVO;
import com.cbgmall.domain.UserInfoVO;
import com.cbgmall.dto.LoginDTO;
import com.cbgmall.mapper.MemberMapper;

import lombok.Setter;

@Service // bean name : memberServiceImpl
public class MemberServiceImpl implements MemberService {

	@Setter(onMethod_ = @Autowired)
	private MemberMapper mapper;
	
	@Override
	public int checkIdDuplicate(String mem_id) throws Exception {
		// TODO Auto-generated method stub
		return mapper.checkIdDuplicate(mem_id);
	}

	@Override
	public MemberVO login_ok(LoginDTO dto) throws Exception {
		
		return mapper.login_ok(dto);
	}

	@Override
	public MemberVO member_info(String mem_id) throws Exception {
		// TODO Auto-generated method stub
		return mapper.member_info(mem_id);
	}

	@Override
	public boolean modifyPOST(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		return mapper.modifyPOST(vo) == 1;
	}

	@Override
	public void join(MemberVO vo) throws Exception {
		
		mapper.join(vo);		
	}

	@Override
	public MemberVO find_pwd(String mem_id, String mem_name) throws Exception {
		// TODO Auto-generated method stub
		return mapper.find_pwd(mem_id, mem_name);
	}

	@Override
	public String find_id(String mem_name) throws Exception {
		// TODO Auto-generated method stub
		return mapper.find_id(mem_name);
	}

	@Override
	public void member_delete(String mem_id) throws Exception {
		// TODO Auto-generated method stub
		mapper.member_delete(mem_id);
	}

	@Override
	public List<UserInfoVO> userinfo_list() throws Exception {
		// TODO Auto-generated method stub
		return mapper.userinfo_list();
	}
	
	@Override
	public void update_pwd(LoginDTO dto) throws Exception {
		// TODO Auto-generated method stub
		mapper.update_pwd(dto);
	}

}
