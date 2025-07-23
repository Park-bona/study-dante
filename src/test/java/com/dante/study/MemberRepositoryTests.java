package com.dante.study;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dante.study.entity.Member;
import com.dante.study.repository.IMemberRepository;

@SpringBootTest
public class MemberRepositoryTests {

    @Autowired
    private IMemberRepository iMemberRepository;

    @Test
    public void findAllMember() {
        
        List<Member> memberList = iMemberRepository.findAll();
        
        for (Member member : memberList) {
            System.out.println(member);
        }

    }

}
