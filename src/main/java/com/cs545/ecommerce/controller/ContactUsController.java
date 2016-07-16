/**
 * 
 */
package com.cs545.ecommerce.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cs545.ecommerce.domain.Category;
import com.cs545.ecommerce.domain.ContactUs;
import com.cs545.ecommerce.service.CategoryService;

/**
 * @author Solomon Kassahun
 *
 */
@Controller
public class ContactUsController {
	@Autowired
	private CategoryService catService;
	@RequestMapping(value="/jsp/ContactUs", method = RequestMethod.GET)
	public String getContactUsForm(Model model ) {
		List<Category> Matricescategories = catService.getCategoriesByMainCategory("Matrices");
		model.addAttribute("Matricescategories", Matricescategories);
		ContactUs contactUs = new ContactUs();
		model.addAttribute("contactUs", contactUs);
		model.addAttribute("pageToRender", "jsp/ContactUs.jsp");
		return "UI/template";		
	}
	
	@RequestMapping(value="/jsp/ContactUs", method = RequestMethod.POST)
	public String captureContactUsData(@ModelAttribute("contactUs") @Valid ContactUs contactUs, BindingResult result, HttpServletRequest request, Model model){
		if(result.hasErrors()) {
			model.addAttribute("pageToRender", "jsp/ContactUs.jsp");
			return "UI/template";		
        }
				
		//model.addAttribute("contactUsData", contactUsData);		
		model.addAttribute("pageToRender", "jsp/ContactUsConfirm.jsp");
		return "UI/template";		
	}

}
