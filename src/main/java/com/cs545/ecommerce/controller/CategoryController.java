package com.cs545.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cs545.ecommerce.domain.Category;
import com.cs545.ecommerce.domain.Product;
import com.cs545.ecommerce.service.CategoryService;
import com.cs545.ecommerce.service.ProductService;

@Controller
public class CategoryController {
	@Autowired
	private ProductService productService;
	@Autowired
	private CategoryService catservice;

	@RequestMapping(value = "/Clothes")
	public String getClothes(Model model) {
		List<Product> products = productService.getAllProducts();
		List<Category> categories = catservice.getAllCategories();
		model.addAttribute("categories", categories);
		model.addAttribute("products", products);
		model.addAttribute("categoryName", "Clothes Category");
		model.addAttribute("pageToRender", "jsp/Category.jsp");
		return "UI/template";
	}

	@RequestMapping(value = "/Mattrices")
	public String getMattrices(Model model) {
		List<Product> products = productService.getAllProducts();
		List<Category> categories = catservice.getAllCategories();
		model.addAttribute("categories", categories);
		model.addAttribute("products", products);
		model.addAttribute("categoryName", "Mattrices Category");
		model.addAttribute("pageToRender", "jsp/Category.jsp");
		return "UI/template";
	}
	@RequestMapping(value = "/Electronics")
	public String getElectronics(Model model) {
		List<Product> products = productService.getAllProducts();
		List<Category> categories = catservice.getAllCategories();
		model.addAttribute("categories", categories);
		model.addAttribute("products", products);
		model.addAttribute("categoryName", "Electronics Category");
		model.addAttribute("pageToRender", "jsp/Category.jsp");
		return "UI/template";
	}
	
	@RequestMapping(value = "/Category/{categoryName}",method=RequestMethod.GET)
	public String getCategoryByName(@PathVariable("categoryName") String caregoryName, Model model) {
		List<Product> products = productService.getAllProducts();
		List<Category> categories = catservice.getAllCategories();
		model.addAttribute("categories", categories);
		model.addAttribute("products", products);
		model.addAttribute("categoryName", "Electronics Category");
		model.addAttribute("pageToRender", "jsp/Category.jsp");
		return "UI/template";
	}
	

}
