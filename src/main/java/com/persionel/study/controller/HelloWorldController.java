package com.persionel.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController{

	@RequestMapping("/hello.action")
	public ModelAndView sayHello() throws Exception {
		System.out.println("======enter handler=====");
		ModelAndView mv = new ModelAndView();
		mv.addObject("message","Hello World!");
		mv.setViewName("index");
		return mv;
	}
	
}
