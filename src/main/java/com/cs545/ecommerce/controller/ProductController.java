package com.cs545.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs545.ecommerce.domain.Category;
import com.cs545.ecommerce.domain.Product;
import com.cs545.ecommerce.repository.impl.InMemoryCategoryRepository;
import com.cs545.ecommerce.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService service;
	@Autowired
	private InMemoryCategoryRepository rep;

	/*
	 * This is for displaying the single page of the product
	 */
	@RequestMapping(value = "/product/{productId}", method = RequestMethod.GET)
	public String getProductById(@PathVariable String productId, Model model) {
		Product product=service.getProductById(productId);
		List<Category> categories=rep.getAllCategories();
		//List<Product> subProducts=service.getProductsByCategoryName(product.getCategory().getCategoryName());
		List<Product> subProducts=service.getAllProducts();
		
		model.addAttribute("subProducts", subProducts);
		model.addAttribute("categories", categories);
		model.addAttribute("product", product);
		model.addAttribute("pageToRender", "jsp/product.jsp");
		return "UI/template";
	}
	
	/*
	 * This is for displaying the single page of the product
	 */
	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public String getProductByName(@RequestParam String searchInput, Model model) {
		List<Product> products= service.searchProduct(searchInput);
		
		model.addAttribute("products", products);
		model.addAttribute("pageToRender", "jsp/products.jsp");
		return "UI/template";
	}
}
