package com.project.dao;

import com.project.dto.MemberDTO;

public interface IMemberDAO {
	 
	public String getTime();
	public void insertMember(MemberDTO mDto);
	public MemberDTO selMember(String id) throws Exception;
	public MemberDTO selLogininfo(String id, String pwd) throws Exception;
	public int updateMember(MemberDTO mDto) throws Exception;
	public int deleteMember(String id) throws Exception;
}
