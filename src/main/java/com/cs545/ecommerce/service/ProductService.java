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
    List<Product> getAllProducts();
    Product getProductById(String productId);
    void addProduct(Product newProduct);
    List<Product> getProductsByCategoryName(String categoryName);
    List<Product> searchProduct(String category, String searchInput);
    List<Product> searchProduct(String searchInput);
    List<Product> getProductsByMainCat(String name);
}
