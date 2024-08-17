package com.telusko.SpringWebMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.telusko.SpringWebMVC.model.User;

@Controller
public class HomeController {
	
	@ModelAttribute("course")
	public String courseName() {
		return "Full Stack Java";
	}
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("addUser")
	public String addUser(User user) {
		return "result";
	}

}
