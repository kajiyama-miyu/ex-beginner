package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {

	@RequestMapping("")
	public String index() {
		return "exam02";
	}
	
	@RequestMapping("/calc")
	public String calc(Integer num1, Integer num2, Model model) {
		model.addAttribute("num1", num1);
		model.addAttribute("num2", num2);
		int answer = num1+ num2;
		model.addAttribute("answer", answer);
		
		return "exam02-result";
	}
	
	@RequestMapping("/calc2")
	public String calc2() {
		return "exam02_result2";
	}
}
