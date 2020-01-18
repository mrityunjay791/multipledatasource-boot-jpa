package com.mrityunjay.multipledatasource.controller.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mrityunjay.multipledatasource.model.member.Member;
import com.mrityunjay.multipledatasource.service.member.MemberService;

@RestController
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	

	@GetMapping("/list")
	public List<Member> getAllMembers() {
		return memberService.getAllMembers();
	}
	
	
	@PostMapping("/save")
	@ResponseBody
	public Member addMember(@RequestBody Member member) {
		System.out.println(member);
		return memberService.saveMember(member);
	}
}
