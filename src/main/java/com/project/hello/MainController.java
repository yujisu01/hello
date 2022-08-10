package com.project.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class MainController {
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@RequestMapping(value = "/main", method = {RequestMethod.GET})
	public String main(Model model) {
		// localhost:8080/main - 정상
		// localhost:8080/hello/main - 비정상 (RequestMapping("/hello/*") 로 했었음(경로못찾음)
		logger.info("main...");
		logger.debug("log4j Test");
		
		return "main";
	}
	@RequestMapping(value = "/login", method = {RequestMethod.GET})
	public String login(Model model) {
		logger.info("login...");
		
		return "login";
	}
	@RequestMapping(value = "/join", method = {RequestMethod.GET})
	public String join(Model model) {
		logger.info("join...");
		
		return "join";
	}
	
	

}
