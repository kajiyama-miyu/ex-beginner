package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Member;
import com.example.service.MemberService;

@Controller
@RequestMapping("/exam05")
public class Exam05Controller {
	
	@Autowired
	private MemberService service;

	@RequestMapping("")
	public String index() {
		return "exam05";
	}
	
	@RequestMapping("result")
	public String viewName(String name, Model model) {
		
		List<Member> member = service.findByName(name);
		
		model.addAttribute("member", member);
		
		return "exam05-result";
	
	}
}
