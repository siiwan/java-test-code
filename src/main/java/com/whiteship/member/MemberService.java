package com.whiteship.member;

import com.whiteship.domain.Member;
import com.whiteship.domain.Study;

import java.util.Optional;

public interface MemberService {

    Optional<Member> findById(Long memberId);

//    void validate(Long memberId);
//
//    void notify(Study newstudy);
//
//    void notify(Member member);
}
