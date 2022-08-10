package com.project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class MemberDTO {
	private String id;
	private String pwd;
	private String email;
	private String name;
	
	// lombok 사용
	// @Data : getter, setter 기능
	// @NoArgsConstructor : 파라미터가 없는 생성자 생성
	// @AllArgsConstructor : 클래스에 존재하는 모든 필드에 대한 생성자 자동생성
	

}
