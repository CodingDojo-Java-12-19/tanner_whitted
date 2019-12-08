package com.tw.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
	@RequestMapping("/")
	public String welcome(@RequestParam(value="name", required= false) String name) {
		if (name == null) {
			return ("<h1>Hello Unknown!</h1> <br> <h2>Welcome to SpringBoot</h2");
		}
		return ("<h1>Hello " + name + "</h1> <br> <h2>Welcome to SpringBoot</h2");
	}
	
}
