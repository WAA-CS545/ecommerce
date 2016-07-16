/**
 * 
 */
package com.cs545.ecommerce.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cs545.ecommerce.domain.User;

/**
 * @author Solomon Kassahun
 *
 */
@Controller
public class CheckoutController {
	@RequestMapping(value = "/checkoutConfirmation", method = RequestMethod.GET)
	public String getCheckoutPage(HttpServletRequest request, Model model){
		model.addAttribute("pageToRender", "jsp/checkoutConfirmation.jsp");
		return "/UI/template";	
		}	
	
}
