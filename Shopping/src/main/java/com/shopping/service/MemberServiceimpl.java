package com.shopping.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.shopping.dao.MemberDAO;
import com.shopping.domain.MemberVO;

@Service
public class MemberServiceimpl implements MemberService {
	
	 @Inject
	 private MemberDAO dao;

	@Override
	public void signup(MemberVO vo) throws Exception {
		
		dao.signup(vo);
		// TODO Auto-generated method stub
		
	}

}
