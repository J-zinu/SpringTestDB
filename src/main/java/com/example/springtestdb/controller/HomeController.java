package com.example.springtestdb.controller;

import com.example.springtestdb.domain.Member;
import com.example.springtestdb.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController {

    @GetMapping("/error")
    public String handleError() {
        return "error";
    }

    @GetMapping("/")
    public String home(){
        return "home";
    }
    @Autowired
    private MemberMapper membermapper;

    @GetMapping("/mybatisAnnotation")
    @ResponseBody
    public List<Member> memberList(){
        return membermapper.getList();
    }

    @GetMapping("/mybatisXml")
    @ResponseBody
    public List<Member> memberList2(){
        return membermapper.getList2();
    }

}
