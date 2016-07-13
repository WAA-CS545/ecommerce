package com.cs545.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cs545.ecommerce.domain.Category;
import com.cs545.ecommerce.domain.Product;
import com.cs545.ecommerce.repository.impl.InMemoryCategoryRepository;
import com.cs545.ecommerce.service.ProductService;
  
@Controller
public class HomeController {
	@Autowired
	private ProductService pService;
	@Autowired
	private InMemoryCategoryRepository rep;

 
	@RequestMapping({"/","/home"})
	public String welcome(Model model) {
		
		List<Category> categories=rep.getAllCategories();
		List<Product> homeProducts=pService.getAllProducts();
		
		model.addAttribute("categories", categories);
	  
	    model.addAttribute("homeProducts", homeProducts);
		model.addAttribute("pageToRender", "jsp/home.jsp");
		
		return "UI/template";
	}
 
}
