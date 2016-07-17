package com.cs545.ecommerce.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cs545.ecommerce.domain.Category;
import com.cs545.ecommerce.domain.Product;
import com.cs545.ecommerce.service.CategoryService;
import com.cs545.ecommerce.service.ProductService;

@Controller
@SessionAttributes("sessionId")
public class HomeController {
	@Autowired
	private ProductService pService;
	@Autowired
	private CategoryService catService;

	@RequestMapping({ "/", "/home" })
	public String welcome(Model model, HttpServletRequest request) {
		//Create sessionId for user. SessionId also serves as orderId
		model.addAttribute("sessionId", request.getSession(true).getId());
		List<Category> categories = catService.getCategoriesByMainCategory("Matrices");
		List<Product> homeProducts = pService.getAllProducts();
		List<Category> Matricescategories = catService.getCategoriesByMainCategory("Matrices");
		model.addAttribute("Matricescategories", Matricescategories);		
		model.addAttribute("categories", categories);
		model.addAttribute("homeProducts", homeProducts);
		model.addAttribute("pageToRender", "jsp/home.jsp");
		return "UI/template";
	}

}
