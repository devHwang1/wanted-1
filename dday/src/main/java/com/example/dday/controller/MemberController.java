package com.example.dday.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member/*")
public class MemberController {

    @GetMapping("/findId")
    public void findId(){}

    @GetMapping("/findPw")
    public void findPw(){}

    @GetMapping("/login")
    public void login(){}

    @GetMapping("/signup")
    public void signup(){}

    @PostMapping("/signupOK")
    public void signupOK(){}

    @GetMapping("/userDivide")
    public void userDivide(){}

}
