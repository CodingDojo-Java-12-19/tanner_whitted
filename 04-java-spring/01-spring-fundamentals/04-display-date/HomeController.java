package com.tw.displayDate;


import java.util.Date;

import org.apache.tomcat.jni.Time;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index() {
		return ("index.jsp");
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		Date date = new Date();
		model.addAttribute("rightNow", date);
		return ("date.jsp");
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		Time time = new Time();
		model.addAttribute("rightNow", time);
		return ("time.jsp");
	}
	
}
