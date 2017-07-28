package com.kikicr.myapp.http.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HelloController {
	private static final Logger logger = Logger.getLogger(HelloController.class);
	@RequestMapping("")
	public String home(){
		logger.info("index");
		return "index";
	}
}
