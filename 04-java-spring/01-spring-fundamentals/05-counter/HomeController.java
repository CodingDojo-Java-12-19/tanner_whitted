package com.tw.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller


public class HomeController {
	private int getSessionCount(HttpSession sesh) {
		Object seshVal = sesh.getAttribute("count");
		if(seshVal == null) {
			setSessionCount(sesh, 0);
			seshVal = sesh.getAttribute("count");
		}
		return (Integer)seshVal;
	}
	private void setSessionCount(HttpSession sesh, int val) {
		sesh.setAttribute("count", val);
	}
	@RequestMapping("/")
	public String home() {
		return ("index.jsp");
	}
	
	@RequestMapping("/counter")
	public String counter(HttpSession session) {	
		int currCount = getSessionCount(session);
		setSessionCount(session, ++currCount);
		return ("counter.jsp");
	}
}