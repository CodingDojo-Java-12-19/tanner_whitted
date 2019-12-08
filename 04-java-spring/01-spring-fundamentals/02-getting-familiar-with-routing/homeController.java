package com.tw.routing;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")

public class HomeController {

	@RequestMapping("")
	public String coding() {
		return ("Hello Coding Dojo!");
	}

	
	@RequestMapping("/python")
	public String python() {
		return ("Python/Django was great!");
	}
	
	@RequestMapping("/java")
	public String java() {
		return ("Java/Spring is better!");
	}
}
