package com.project.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.dto.MemberDTO;

@Repository
public class MemberDAOImpl implements IMemberDAO{
	//@Autowired
	//private SqlSession sqlSession;
	//private static final String namespace = "";

	@Override
	public String getTime() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertMember(MemberDTO mDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MemberDTO selMember(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberDTO selLogininfo(String id, String pwd) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateMember(MemberDTO mDto) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMember(String id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
