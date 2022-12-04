package com.example.exmulti.member.service;

import com.example.exmulti.member.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

@RequiredArgsConstructor
@Service
public class MemberService {
    @Value("${test.str.v1}")
    private String test;

    public String helloWorld() {
        Member member = new Member(1L, "Hello World");
        System.out.println("----------");
        System.out.println(test);
        System.out.println("----------");
        return member.getName();
    }
}
