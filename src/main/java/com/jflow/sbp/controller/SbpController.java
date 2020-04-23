package com.jflow.sbp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SbpController {
	
	@RequestMapping("/")
	public String main(Model model) throws Exception
	{
		model.addAttribute("hello","Spring Boot에 오신것을 환영합니다.");
		return "index";
	}

}
