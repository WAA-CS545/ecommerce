/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cs545.ecommerce.repository;


import java.util.List;
import com.cs545.ecommerce.domain.Product;

/**
 *
 * @author Solomon Kassahun
 */
public interface ProductRepository {
    List<Product> getAllProducts();
    Product getProductById(String productId);
}
