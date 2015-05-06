package com.ilya.spring4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

	@RequestMapping(value = "/greeting")
	public String sayHello(Model model){
		model.addAttribute("greeting", "Hello world!!!");
		
		return "hello.jsp";
	}
}
