/**
 * 
 */
package com.cs545.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Ivan
 *
 */

@Controller
public class MoreInfoController {
	
	@RequestMapping("/howToOrder")
	public String howToOrder(Model model){
		
		model.addAttribute("pageToRender", "jsp/howToOrder.jsp");
		return "UI/template";
	}
	
	@RequestMapping("/faq")
	public String faq(Model model) {
		model.addAttribute("pageToRender", "jsp/faq.jsp");
		return "UI/template";
	}
	
	@RequestMapping("/location")
	public String location(Model model) {
		model.addAttribute("pageToRender", "jsp/location.jsp");
		return "UI/template";
	}
	
	@RequestMapping("/shipping")
	public String shipping(Model model) {
		model.addAttribute("pageToRender", "jsp/shipping.jsp");
		return "UI/template";
	}
	
	@RequestMapping("/membership")
	public String membership(Model model) {
		model.addAttribute("pageToRender", "jsp/membership.jsp");
		return "UI/template";
	}
	
}
