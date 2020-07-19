package com.jflow.sbp.controller;

import com.jflow.sbp.service.MemberService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class MainController {

    private MemberService memberService;

    // 메인 페이지
    @GetMapping("/main")
    public String index() {
        return "/contents/main";
    }

}