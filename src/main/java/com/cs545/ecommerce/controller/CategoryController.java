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
		List<Product> products = productService.getProductsByMainCat("Clothes");
		model.addAttribute("products", products);
		String categoryName = "Clothes Category";
		return getPage(categoryName, products, model);
	}
	
	@RequestMapping(value = "/Shoes")
	public String getShoes(Model model) {
		List<Product> products = productService.getProductsByMainCat("Shoes");		
		String categoryName = "Shoes Category";
		return getPage(categoryName, products, model);
	}

	@RequestMapping(value = "/Mattresses")
	public String getMattrices(Model model) {
		List<Product> products = productService.getProductsByMainCat("Matrices");
		String categoryName = "Mattresses Category";
		return getPage(categoryName, products, model);
	}

	@RequestMapping(value = "/Electronics")
	public String getElectronics(Model model) {
		List<Product> products = productService.getProductsByMainCat("Electronics");
		model.addAttribute("products", products);
		String categoryName = "Electronics Category";
		return getPage(categoryName, products, model);
	}

	@RequestMapping(value = "/Category/{categoryName}", method = RequestMethod.GET)
	public String getCategoryByName(@PathVariable("categoryName") String caregoryName, Model model) {
		if (productService.getProductsByCategoryName(caregoryName) != null)
		model.addAttribute("products", productService.getProductsByCategoryName(caregoryName));
		List<Category> categories = catservice.getAllCategories();
		model.addAttribute("categories", categories);
		List<Category> Matricescategories = catservice.getCategoriesByMainCategory("Matrices");
		model.addAttribute("Matricescategories", Matricescategories);		
		model.addAttribute("categoryName", "Electronics Category");
		model.addAttribute("pageToRender", "jsp/Category.jsp");
		return "UI/template";
	}
	
	public String getPage(String categoryName, List<Product> products, Model model){
		model.addAttribute("products", products);
		model.addAttribute("categoryName", categoryName);
		model.addAttribute("pageToRender", "jsp/Category.jsp");
		return "UI/template";		
	}

}
