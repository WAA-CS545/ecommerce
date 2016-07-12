/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cs545.ecommerce.repository.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

import com.cs545.ecommerce.domain.Category;
import com.cs545.ecommerce.domain.Image;
import com.cs545.ecommerce.domain.Product;
import com.cs545.ecommerce.repository.ProductRepository;

/**
 *
 * @author Solomon Kassahun
 */
@Repository
public class InMemoryProductRepository implements ProductRepository {

    private final List<Product> listOfProduct;
    private List<Image> images;

    public InMemoryProductRepository() {
        listOfProduct = new ArrayList<Product>();

        Product iPhone = new Product("P1234", "iPhone", BigDecimal.valueOf(499));
        iPhone.setDescription("iPhone 7");
        iPhone.setCategory(new Category("Electronics", "Cell phones"));
        iPhone.setManufacturer("Apple");
        iPhone.setUnitsInStock(100);
        images = new ArrayList<Image>();
        images.add(new Image("iPhone 7", "P1234"));
        iPhone.setImages(images);

        Product nexus7 = new Product("P1235", "Nexus 7", BigDecimal.valueOf(350));
        nexus7.setDescription("Nexus 7 tablet");
        nexus7.setCategory(new Category("Electronics", "Tablet"));
        nexus7.setManufacturer("Asus");
        nexus7.setUnitsInStock(500);
        images = new ArrayList<Image>();
        images.add(new Image("Nexus 7", "P1235"));
        nexus7.setImages(images);


        Product dellLatitude = new Product("P1236", "Dell Latitude", BigDecimal.valueOf(700));
        dellLatitude.setDescription("Dell latitude laptop");
        dellLatitude.setCategory(new Category("Computers", "Laptops"));
        dellLatitude.setManufacturer("Dell");
        dellLatitude.setUnitsInStock(50);
        images = new ArrayList<Image>();
        images.add(new Image("Dell latitude", "P1236"));
        dellLatitude.setImages(images);
        
        Product hpPavilion = new Product("P1237", "HP Pavilion", BigDecimal.valueOf(200));
        hpPavilion.setDescription("Dual Core PC from HP");
        hpPavilion.setCategory(new Category("Computers", "PCs"));
        hpPavilion.setManufacturer("HP");
        hpPavilion.setUnitsInStock(40);
        images = new ArrayList<Image>();
        images.add(new Image("HP Pavilion", "P1237"));
        hpPavilion.setImages(images);
        
        Product mensweater = new Product("P1238", "Men's Sweater", BigDecimal.valueOf(20));
        mensweater.setDescription("Men's sweater from Amani");
        mensweater.setCategory(new Category("Clothes", "Men clothes"));
        mensweater.setManufacturer("Geogio Armani");
        mensweater.setUnitsInStock(15);
        images = new ArrayList<Image>();
        images.add(new Image("Men's Sweater", "P1238"));
        mensweater.setImages(images);

        listOfProduct.add(iPhone);
        listOfProduct.add(nexus7);
        listOfProduct.add(dellLatitude);

    }

 
    public List<Product> getAllProducts() {
        return listOfProduct;
    }
 
    public Product getProductById(String productId) {
        for(Product product: listOfProduct){
            if(product.getProductId().equals(productId)) {
                return product;
            } 
        }
        throw new IllegalArgumentException(
                String.format("Product with id %s not found", productId));
    }
    
    public List<Product> getProductByCategoryName(String categoryName){
    	List<Product> productsInCategory = new ArrayList<Product>();
    	for(Product product : listOfProduct){
    		if(product.getCategory().getCategoryName().equals(categoryName)){
    			productsInCategory.add(product);
    		}    		
    	}
    	return productsInCategory; 	
    }

}
