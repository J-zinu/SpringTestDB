package com.example.springtestdb.domain;

import lombok.Data;

@Data
public class Member {
    private Long id;
    private String email;
    private String name;
    private String password;

    public Member(){

    }

    public Member(String email, String name, String password){
        this.email = email;
        this.name = name;
        this.password = password;
    }
}
