package com.tw.dojoSurvey;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tw.dojoSurvey.models.Survey;

@Controller

public class HomeController {

	@RequestMapping("/")
	public String index() {
		return ("index.jsp");
	}
	
	@RequestMapping(value="/survey", method=RequestMethod.POST)
	public String Results(@RequestParam(value="name") String name, 
		@RequestParam(value="dojoLocation") String dojoLocation,
		@RequestParam(value="favoriteLanguage") String favoriteLanguage,
		@RequestParam(value="comment") String comment,
		Model model){
	model.addAttribute("result", new Survey(name, dojoLocation, favoriteLanguage, comment));		
	return "result.jsp";
	}
}