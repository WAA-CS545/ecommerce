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
import com.cs545.ecommerce.repository.CategoryRepository;
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
    @Autowired
    CategoryRepository categoryRepository;
    /* (non-Javadoc)
     * @see com.cs545.ecommerce.service.ProductService#getAllProducts()
     */
    @Override
	public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

    /* (non-Javadoc)
     * @see com.cs545.ecommerce.service.ProductService#getProductById(java.lang.String)
     */
    @Override
	public Product getProductById(String productId) {
        return productRepository.getProductById(productId);
    }

    /* (non-Javadoc)
     * @see com.cs545.ecommerce.service.ProductService#addProduct(com.cs545.ecommerce.domain.Product)
     */
    @Override
	public void addProduct(Product newProduct){
        productRepository.getAllProducts().add(newProduct);    
    }
    
    /* (non-Javadoc)
     * @see com.cs545.ecommerce.service.ProductService#getProductsByCategoryName(java.lang.String)
     */
    @Override
	public List<Product> getProductsByCategoryName(String categoryName){
     if(productRepository.getProductByCategoryName(categoryName).isEmpty()==true) return null;
    	
    	return productRepository.getProductByCategoryName(categoryName);
    }
    
    /* (non-Javadoc)
     * @see com.cs545.ecommerce.service.ProductService#searchProduct(java.lang.String, java.lang.String)
     */
    @Override
	public List<Product> searchProduct(String category, String searchInput){
    	return productRepository.searchProduct(category, searchInput);
    }

	/* (non-Javadoc)
	 * @see com.cs545.ecommerce.service.ProductService#searchProduct(java.lang.String)
	 */
	@Override
	public List<Product> searchProduct(String searchInput) {
		return productRepository.searchProduct(searchInput);
	}

	
	/* (non-Javadoc)
	 * @see com.cs545.ecommerce.service.ProductService#getProductsByMainCat(java.lang.String)
	 */
	@Override
	public List<Product> getProductsByMainCat(String mainCatName) {
		return productRepository.getProductsByMainCat(mainCatName);
	}
	
}
