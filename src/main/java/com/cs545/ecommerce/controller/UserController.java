package com.cs545.ecommerce.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cs545.ecommerce.domain.User;

@Controller
public class UserController {

	
	@RequestMapping(value="/register",method=RequestMethod.GET )
	public String getRegister(Model model){
		model.addAttribute("newUser",new User());
		model.addAttribute("pageToRender", "jsp/register.jsp");
		return "UI/template";
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST )
	public String postRegister(@ModelAttribute("newUser")  @Valid User newUser, BindingResult result, Model model){
		 
		
		if(result.hasErrors()) {
			model.addAttribute("pageToRender", "jsp/register.jsp");
			return "UI/template";		
        }
		return "redirect:/registerConfirmation";
	}
	
	@RequestMapping(value="/registerConfirmation",method=RequestMethod.GET )
	public String getRegisterConfirmation(Model model){
		model.addAttribute("pageToRender", "jsp/registerConfirmation.jsp");
		return "UI/template";
	}
}
