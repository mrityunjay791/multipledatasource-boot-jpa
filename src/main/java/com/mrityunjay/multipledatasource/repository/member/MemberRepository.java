package com.mrityunjay.multipledatasource.repository.member;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mrityunjay.multipledatasource.model.member.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
	
}