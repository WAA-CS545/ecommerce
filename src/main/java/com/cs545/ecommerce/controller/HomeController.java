package com.cs545.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
  
@Controller
public class HomeController {

 
	@RequestMapping({"/","/home"})
	public String welcome(Model model) {
		
		
		return "UI/jsp/home";
	}
 
}
