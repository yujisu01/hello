package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dto.MemberDTO;
import com.project.mapper.MemerMapper;
import com.project.service.IMemberService;

@Service
public class MemberServiceImpl implements IMemberService{

	@Autowired
	private MemerMapper mapper;
	
	@Override
	public MemberDTO login(MemberDTO mDto) {
		// TODO Auto-generated method stub
		return mapper.login(mDto);
	}


}
