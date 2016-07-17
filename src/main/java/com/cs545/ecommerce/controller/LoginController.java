package com.cs545.ecommerce.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import com.cs545.ecommerce.domain.Category;
import com.cs545.ecommerce.domain.User;
import com.cs545.ecommerce.domain.UserCredentials;
import com.cs545.ecommerce.service.CategoryService;
import com.cs545.ecommerce.service.UserCredentialsService;

@Controller
@SessionAttributes("user")
public class LoginController {
	@Autowired
	UserCredentialsService credentialsService;
	@Autowired
	private CategoryService catservice;;
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login(HttpServletRequest request, Model model) {
		List<Category> Matricescategories = catservice.getCategoriesByMainCategory("Matrices");
		model.addAttribute("Matricescategories", Matricescategories);		
		model.addAttribute("pageToRender", "jsp/UserLogin.jsp");
		String nextPage = (String)request.getAttribute("nextPage");
		if(nextPage != null){
			model.addAttribute("nextPage", nextPage);
		}
 		return "/UI/template";
	}
	
	@RequestMapping(value="/postLogin", method = RequestMethod.GET)
	public String PostLogin(HttpServletRequest request, Model model) {
		List<Category> Matricescategories = catservice.getCategoriesByMainCategory("Matrices");
		model.addAttribute("Matricescategories", Matricescategories);		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (!(auth instanceof AnonymousAuthenticationToken)){    
        	model.addAttribute("user", getPrincipal());
        	String nextPage = (String)request.getAttribute("nextPage");
        	if(nextPage != null){
        		return "redirect:/"+nextPage;
        	}else{
        		return "redirect:/home";        	
        	}        	
        }
 		return "redirect:/login";
	}
 
	@RequestMapping(value="/loginfailed", method = RequestMethod.GET)
	public String loginerror(Model model) {
		List<Category> Matricescategories = catservice.getCategoriesByMainCategory("Matrices");		
		model.addAttribute("error", "true");
		model.addAttribute("Matricescategories", Matricescategories);		
		model.addAttribute("pageToRender", "jsp/UserLogin.jsp");		
 		return "/UI/template"; 
	}
 
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logoutPage (HttpServletRequest request, HttpServletResponse response, SessionStatus status)	{
	    status.setComplete();
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){    
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
       
 		return "redirect:/home";
 	}
	
	private User getPrincipal(){
        String userName = null;
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
 
        if (principal instanceof UserDetails) {
            userName = ((UserDetails)principal).getUsername();
        } else {
            userName = principal.toString();
        }
        UserCredentials uc = credentialsService.findByUserName(userName);
        return uc.getUser();
    }
}
