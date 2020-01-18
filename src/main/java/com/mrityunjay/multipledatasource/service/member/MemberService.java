package com.mrityunjay.multipledatasource.service.member;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mrityunjay.multipledatasource.model.member.Member;

@Service
public interface MemberService {

	public Member saveMember(Member member);
	public List<Member> getAllMembers();
	
}
