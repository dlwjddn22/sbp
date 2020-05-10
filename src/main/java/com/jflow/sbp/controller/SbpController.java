package com.jflow.sbp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SbpController {

	@RequestMapping("/")
	public String login(Model model) throws Exception {
		model.addAttribute("hello", "Spring Boot에 오신것을 환영합니다.");
		return "index";
	}

	@RequestMapping("/main")
	public String main(Model model) throws Exception {
		return "/contents/main";
	}

	@RequestMapping("/page1")
	public String page1(Model model) throws Exception {
		return "/contents/page1";
	}

	@RequestMapping("/page2")
	public String page2(Model model) throws Exception {
		return "/contents/page2";
	}

}
