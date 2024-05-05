package com.shopping.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.shopping.domain.MemberVO;
@Repository
public class MemberDAOimpl implements MemberDAO {
	
	@Inject
	private SqlSession sql;
	
	private static String namespace ="com.shopping.mappers.memberMapper";

	@Override
	public void signup(MemberVO vo) throws Exception {
		
		sql.insert(namespace + ".signup" , vo);
		// TODO Auto-generated method stub
		
	}

}
