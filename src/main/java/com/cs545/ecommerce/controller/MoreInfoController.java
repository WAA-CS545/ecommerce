/**
 * 
 */
package com.cs545.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cs545.ecommerce.domain.Category;
import com.cs545.ecommerce.service.CategoryService;

/**
 * @author Ivan
 *
 */

@Controller
public class MoreInfoController {
	@Autowired
	private CategoryService catservice;
	@RequestMapping("/howToOrder")
	public String howToOrder(Model model){
		List<Category> Matricescategories = catservice.getCategoriesByMainCategory("Matrices");
		model.addAttribute("Matricescategories", Matricescategories);
		
		model.addAttribute("pageToRender", "jsp/howToOrder.jsp");
		return "UI/template";
	}
	
	@RequestMapping("/faq")
	public String faq(Model model) {
		model.addAttribute("pageToRender", "jsp/faq.jsp");
		List<Category> Matricescategories = catservice.getCategoriesByMainCategory("Matrices");
		model.addAttribute("Matricescategories", Matricescategories);
		
		return "UI/template";
	}
	
	@RequestMapping("/location")
	public String location(Model model) {
		model.addAttribute("pageToRender", "jsp/location.jsp");
		List<Category> Matricescategories = catservice.getCategoriesByMainCategory("Matrices");
		model.addAttribute("Matricescategories", Matricescategories);
		
		return "UI/template";
	}
	
	@RequestMapping("/shipping")
	public String shipping(Model model) {
		model.addAttribute("pageToRender", "jsp/shipping.jsp");
		List<Category> Matricescategories = catservice.getCategoriesByMainCategory("Matrices");
		model.addAttribute("Matricescategories", Matricescategories);
		
		return "UI/template";
	}
	
	@RequestMapping("/membership")
	public String membership(Model model) {
		model.addAttribute("pageToRender", "jsp/membership.jsp");
		List<Category> Matricescategories = catservice.getCategoriesByMainCategory("Matrices");
		model.addAttribute("Matricescategories", Matricescategories);
		
		return "UI/template";
	}
	
}
