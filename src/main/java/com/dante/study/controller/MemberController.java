package com.dante.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dante.study.entity.Member;
import com.dante.study.repository.IMemberRepository;

@RestController
@RequestMapping("/api")
public class MemberController {

    @Autowired
    private IMemberRepository iMemberRepository;


    @GetMapping("/member")
    public List<Member> memberAPI() {

        List<Member> memberList = iMemberRepository.findAll();


        return memberList;
    }



}
