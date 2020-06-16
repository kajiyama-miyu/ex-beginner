package com.example.controller;

import java.text.NumberFormat;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {
	
	@Autowired
	public ServletContext application;
	
	@RequestMapping("")
	public String index() {
		return "Exam03";
	}
	
	@RequestMapping("/calc")
	public String calc(Integer price1, Integer price2, Integer price3) {
		int price = price1+price2+price3;
		NumberFormat newPrice = NumberFormat.getNumberInstance();
		application.setAttribute("price", newPrice.format(price));
		
		int totalPrice =(int)(price*1.1);
		NumberFormat newTotalPrice = NumberFormat.getNumberInstance();
		application.setAttribute("totalPrice", newTotalPrice.format(totalPrice));
		
		return "exam03-result";
	}

}
