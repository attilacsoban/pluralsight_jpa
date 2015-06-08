package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AngularController {

	@RequestMapping(value = "/angular",method = RequestMethod.GET)
	public String getAngularPage(Model model){
		return "angular.html";
	}
	
}
