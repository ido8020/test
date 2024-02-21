package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/start/")
public class StartController {

	@GetMapping("index2.do")
	String index2() {
		System.out.println("===> index2.do 확인");
		return "index2.html";		
	}
	
}
