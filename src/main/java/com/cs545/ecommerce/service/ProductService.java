/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cs545.ecommerce.service;

import java.util.List;

import com.cs545.ecommerce.domain.Product;

/**
 *
 * @author Solomon Kassahun
 */
public interface ProductService {
    public List<Product> getAllProducts();
    public Product getProductById(String productId);
    public void addProduct(Product newProduct);
    public List<Product> getProductsByCategoryName(String categoryName);
}
