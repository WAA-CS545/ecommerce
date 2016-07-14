/**
 * 
 */
package com.cs545.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String getContactUsForm(Model model){
		List<Category> Matricescategories = catService.getCategoriesByMainCategory("Matrices");
		model.addAttribute("Matricescategories", Matricescategories);
		
		model.addAttribute("pageToRender", "jsp/ContactUs.jsp");		
		return "UI/template";		
	}
	
	@RequestMapping(value="/jsp/ContactUs", method = RequestMethod.POST)
	public String captureContactUsData(Model model, ContactUs contactUsData){
		List<Category> Matricescategories = catService.getCategoriesByMainCategory("Matrices");
		model.addAttribute("Matricescategories", Matricescategories);
		
		model.addAttribute("contactUsData", contactUsData);		
		model.addAttribute("pageToRender", "jsp/ContactUsConfirm.jsp");
		return "UI/template";		
	}

}
