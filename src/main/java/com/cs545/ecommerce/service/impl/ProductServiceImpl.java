/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cs545.ecommerce.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs545.ecommerce.domain.Product;
import com.cs545.ecommerce.repository.ProductRepository;
import com.cs545.ecommerce.service.ProductService;

/**
 *
 * @author Solomon Kassahun
 */
@Service
public class ProductServiceImpl implements ProductService{
    
    @Autowired
    ProductRepository productRepository;
    
    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

    public Product getProductById(String productId) {
        return productRepository.getProductById(productId);
    }

    public void addProduct(Product newProduct){
        productRepository.getAllProducts().add(newProduct);    
    }
    
    public List<Product> getProductsByCategoryName(String categoryName){
    	return productRepository.getProductByCategoryName(categoryName);
    }
    
}
