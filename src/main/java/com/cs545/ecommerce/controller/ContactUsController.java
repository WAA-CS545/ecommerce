/**
 * 
 */
package com.cs545.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cs545.ecommerce.domain.ContactUs;

/**
 * @author Solomon Kassahun
 *
 */
@Controller
public class ContactUsController {
	@RequestMapping(value="/jsp/ContactUs", method = RequestMethod.GET)
	public String getContactUsForm(Model model){
		model.addAttribute("pageToRender", "jsp/ContactUs.jsp");		
		return "UI/template";		
	}
	
	@RequestMapping(value="/jsp/ContactUs", method = RequestMethod.POST)
	public String captureContactUsData(Model model, ContactUs contactUsData){
		model.addAttribute("contactUsData", contactUsData);		
		model.addAttribute("pageToRender", "jsp/ContactUsConfirm.jsp");
		return "UI/template";		
	}

}
