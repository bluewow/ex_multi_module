package com.example.exmulti.member.domain;

import lombok.Getter;

@Getter
public class Member {
    private Long id;
    private String name;

    public Member(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
