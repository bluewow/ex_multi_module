package com.example.exmulti.member.controller;

import com.example.exmulti.member.service.MemberService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MemberController {

    @Value("${test.str}")
    private String test;

    @Value("${test.str.v1}")
    private String test1;

    private final MemberService memberService;

    @GetMapping("/hello")
    public String helloWorld() {
        return memberService.helloWorld();
    }

    @GetMapping("/test")
    public String testWorld() {
        return test;
    }

    @GetMapping("/test1")
    public String testWorld1() {
        System.out.println("-------1---");
        System.out.println(test);
        System.out.println(test1);
        System.out.println("------1----");
        return test;
    }

}
