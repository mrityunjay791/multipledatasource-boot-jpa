package com.mrityunjay.multipledatasource.service.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrityunjay.multipledatasource.model.member.Member;
import com.mrityunjay.multipledatasource.repository.member.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberRepository memberRepository;

	@Override
	public Member saveMember(Member member) {
		return memberRepository.save(member);
	}

	@Override
	public List<Member> getAllMembers() {
		return memberRepository.findAll();
	}

}
