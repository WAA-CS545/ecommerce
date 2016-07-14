/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cs545.ecommerce.repository.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cs545.ecommerce.domain.Category;
import com.cs545.ecommerce.domain.Image;
import com.cs545.ecommerce.domain.Product;
import com.cs545.ecommerce.repository.CategoryRepository;
import com.cs545.ecommerce.repository.ProductRepository;


@Repository
public class InMemoryProductRepository implements ProductRepository {

private InMemoryCategoryRepository catRep;

    private final List<Product> listOfProduct;
    private List<Image> images;

    public InMemoryProductRepository() {
    	 catRep = new InMemoryCategoryRepository();
        listOfProduct = new ArrayList<Product>();
       

        Product tribica = new Product("P1234", "Tribica living", BigDecimal.valueOf(499));
        tribica.setDescription("Tribica living");
        tribica.setCategory(catRep.getCategoryByName("Tribica"));
        tribica.setManufacturer("American Matrices");
        tribica.setUnitsInStock(100);
        images = new ArrayList<Image>();
        images.add(new Image("Tribica living", "P1234.jpg"));
        images.add(new Image("Clarica", "P1235.jpg"));
        images.add(new Image("Colormate", "P1236.jpg"));
        images.add(new Image("herlequin", "P1237.jpg"));
        tribica.setImages(images);
        
        Product clarica = new Product("P1235", "Clarica", BigDecimal.valueOf(499));
        clarica.setDescription("Clarica");
        clarica.setCategory(catRep.getCategoryByName("Clarica"));
        clarica.setManufacturer("American Matrices");
        clarica.setUnitsInStock(100);
        images = new ArrayList<Image>();
        images.add(new Image("Clarica", "P1235.jpg"));
        images.add(new Image("Clarica", "P1238.jpg"));
        images.add(new Image("Colormate", "P1236.jpg"));
        images.add(new Image("herlequin", "P1237.jpg"));
        clarica.setImages(images);
        
        Product colormate = new Product("P1236", "Colormate", BigDecimal.valueOf(499));
        colormate.setDescription("Colormate");
        colormate.setCategory(catRep.getCategoryByName("Colormate"));
        colormate.setManufacturer("American Matrices");
        colormate.setUnitsInStock(100);
        images = new ArrayList<Image>();
        images.add(new Image("Colormate", "P1236.jpg"));
        images.add(new Image("Clarica", "P1235.jpg"));
        images.add(new Image("Colormate", "P1236.jpg"));
        images.add(new Image("herlequin", "P1237.jpg"));
        colormate.setImages(images);
        
        Product herlequin = new Product("P1237", "Herlequin", BigDecimal.valueOf(499));
        herlequin.setDescription("herlequin");
        herlequin.setCategory(catRep.getCategoryByName("Herlequin"));
        herlequin.setManufacturer("American Matrices");
        herlequin.setUnitsInStock(100);
        images = new ArrayList<Image>();
        images.add(new Image("herlequin", "P1237.jpg"));
        images.add(new Image("Clarica", "P1235.jpg"));
        images.add(new Image("Colormate", "P1236.jpg"));
        images.add(new Image("herlequin", "P1237.jpg"));
        herlequin.setImages(images);
        
        Product littlehome = new Product("P1238", "Little Home", BigDecimal.valueOf(499));
        littlehome.setDescription("littlehome");
        littlehome.setCategory(catRep.getCategoryByName("Littlehome"));
        littlehome.setManufacturer("American Matrices");
        littlehome.setUnitsInStock(100);
        images = new ArrayList<Image>();
        images.add(new Image("littlehome", "P1238.jpg"));
        images.add(new Image("Clarica", "P1235.jpg"));
        images.add(new Image("Colormate", "P1236.jpg"));
        images.add(new Image("herlequin", "P1237.jpg"));
        littlehome.setImages(images);
        
        Product clarissa = new Product("P1240", "Clarissa", BigDecimal.valueOf(499));
        clarissa.setDescription("clarissa");
        clarissa.setCategory(catRep.getCategoryByName("Clarissa"));
        clarissa.setManufacturer("American Matrices");
        clarissa.setUnitsInStock(100);
        images = new ArrayList<Image>();
        images.add(new Image("clarissa", "P1240.jpg"));
        images.add(new Image("Clarica", "P1235.jpg"));
        images.add(new Image("Colormate", "P1236.jpg"));
        images.add(new Image("herlequin", "P1237.jpg"));
        clarissa.setImages(images);
        
        Product essential = new Product("P1241", "Essential", BigDecimal.valueOf(499));
        essential.setDescription("Essential");
        essential.setCategory(catRep.getCategoryByName("Essential"));
        essential.setManufacturer("American Matrices");
        essential.setUnitsInStock(100);
        images = new ArrayList<Image>();
        images.add(new Image("essential", "P1241.jpg"));
        images.add(new Image("Clarica", "P1235.jpg"));
        images.add(new Image("Colormate", "P1236.jpg"));
        images.add(new Image("herlequin", "P1237.jpg"));
        essential.setImages(images);
        
        Product tribecalliving = new Product("P1242", "Tribecal Living", BigDecimal.valueOf(499));
        tribecalliving.setDescription("tribecalliving");
        tribecalliving.setCategory(catRep.getCategoryByName("Tribecalliving"));
        tribecalliving.setManufacturer("American Matrices");
        tribecalliving.setUnitsInStock(100);
        images = new ArrayList<Image>();
        images.add(new Image("tribecalliving", "P1242.jpg"));
        images.add(new Image("Clarica", "P1235.jpg"));
        images.add(new Image("Colormate", "P1236.jpg"));
        images.add(new Image("herlequin", "P1237.jpg"));
        tribecalliving.setImages(images);
        

        
        Product nexus7 = new Product("P1250", "Nexus 7", BigDecimal.valueOf(350));
        nexus7.setDescription("Nexus 7 tablet");
        nexus7.setCategory(new Category("Electronics", "Tablet"));
        nexus7.setManufacturer("Asus");
        nexus7.setUnitsInStock(500);
        images = new ArrayList<Image>();
        images.add(new Image("Nexus 7", "P1235.jpg"));
        nexus7.setImages(images);


        Product dellLatitude = new Product("P1256", "Dell Latitude", BigDecimal.valueOf(700));
        dellLatitude.setDescription("Dell latitude laptop");
        dellLatitude.setCategory(new Category("Computers", "Laptops"));
        dellLatitude.setManufacturer("Dell");
        dellLatitude.setUnitsInStock(50);
        images = new ArrayList<Image>();
        images.add(new Image("Dell latitude", "P1236.jpg"));
        dellLatitude.setImages(images);
        
        Product hpPavilion = new Product("P1260", "HP Pavilion", BigDecimal.valueOf(200));
        hpPavilion.setDescription("Dual Core PC from HP");
        hpPavilion.setCategory(new Category("Computers", "PCs"));
        hpPavilion.setManufacturer("HP");
        hpPavilion.setUnitsInStock(40);
        images = new ArrayList<Image>();
        images.add(new Image("HP Pavilion", "P1260.jpg"));
        hpPavilion.setImages(images);
        
        Product mensweater = new Product("P1290", "Men's Sweater", BigDecimal.valueOf(20));
        mensweater.setDescription("Men's sweater from Amani");
        mensweater.setCategory(new Category("Clothes", "Men clothes"));
        mensweater.setManufacturer("Geogio Armani");
        mensweater.setUnitsInStock(15);
        images = new ArrayList<Image>();
        images.add(new Image("Men's Sweater", "sweater.jpg"));
        mensweater.setImages(images);
        
        Product hoodie = new Product("P1298", "Men hoodie", BigDecimal.valueOf(10));
        hoodie.setDescription("Men's hoodie from Armani");
        hoodie.setCategory(new Category("Clothes", "Men clothes"));
        hoodie.setManufacturer("Geogio Armani");
        hoodie.setUnitsInStock(15);
        images = new ArrayList<Image>();
        images.add(new Image("Men hoodie", "Hoodie.jpg"));
        hoodie.setImages(images);
        
        Product ladiesdress = new Product("P1299", "Ladies dress", BigDecimal.valueOf(30));
        ladiesdress.setDescription("Ladies' dress from Takobel");
        ladiesdress.setCategory(new Category("Clothes", "Women clothes"));
        ladiesdress.setManufacturer("Takobel");
        ladiesdress.setUnitsInStock(5);
        images = new ArrayList<Image>();
        images.add(new Image("Ladies dress", "femaledress.jpg"));
        ladiesdress.setImages(images);
        
        Product mensshoe = new Product("P1288", "Men shoe", BigDecimal.valueOf(80));
        mensshoe.setDescription("Men's show from Clarks");
        mensshoe.setCategory(new Category("Shoes", "Men shoes"));
        mensshoe.setManufacturer("Clarks");
        mensshoe.setUnitsInStock(5);
        images = new ArrayList<Image>();
        images.add(new Image("Men shoe", "mens-shoe.jpg"));
        mensshoe.setImages(images);
        
        Product womenshoe = new Product("P1277", "Women shoe", BigDecimal.valueOf(80));
        womenshoe.setDescription("Ladies' shoes from Clarks");
        womenshoe.setCategory(new Category("Shoes", "Women shoes"));
        womenshoe.setManufacturer("Clarks");
        womenshoe.setUnitsInStock(5);
        images = new ArrayList<Image>();
        images.add(new Image("Women shoe", "womenshoe1.jpg"));
        womenshoe.setImages(images);

        listOfProduct.add(tribica);
        listOfProduct.add(clarica);
        listOfProduct.add(colormate);
        listOfProduct.add(herlequin);
        listOfProduct.add(littlehome);
        listOfProduct.add(clarissa);
        listOfProduct.add(essential);
        listOfProduct.add(tribecalliving);
        listOfProduct.add(nexus7);
        listOfProduct.add(dellLatitude);
        listOfProduct.add(hpPavilion);
        listOfProduct.add(mensweater);
        listOfProduct.add(hoodie);
        listOfProduct.add(ladiesdress);
        listOfProduct.add(mensshoe);
        listOfProduct.add(womenshoe);

    }

 
    public List<Product> getAllProducts() {
        return listOfProduct;
    }
 
    /* (non-Javadoc)
     * @see com.cs545.ecommerce.repository.ProductRepository#getProductById(java.lang.String)
     */
    public Product getProductById(String productId) {
        for(Product product: listOfProduct){
            if(product.getProductId().equals(productId)) {
                return product;
            } 
        }
        throw new IllegalArgumentException(
                String.format("Product with id %s not found", productId));
    }
    
    /* (non-Javadoc)
     * @see com.cs545.ecommerce.repository.ProductRepository#getProductByCategoryName(java.lang.String)
     */
    public List<Product> getProductByCategoryName(String categoryName){
    	List<Product> productsInCategory = new ArrayList<Product>();
    	for(Product product : listOfProduct){
    		String catName = product.getCategory().getCategoryName();
    		if(catName.equals(categoryName)){
    			productsInCategory.add(product);
    		}    		
    	}
    	return productsInCategory; 	
    }
    /* (non-Javadoc)
     * @see com.cs545.ecommerce.repository.ProductRepository#searchProduct(java.lang.String, java.lang.String)
     */
    public List<Product> searchProduct(String category, String inputStr){
    	List<Product> searchResult =  new ArrayList<Product>();
    	inputStr = inputStr.toLowerCase();
    	for(Product product : listOfProduct){
    		String prodName = product.getProductName().toLowerCase();
    		if(product.getCategory().getCategoryName().equals(category) && prodName.contains(inputStr)){
    			searchResult.add(product);
    		}    		    		
    	}
    	return searchResult;
    }


	@Override
	public List<Product> searchProduct(String searchInput) {
		return this.listOfProduct.stream().filter(p->p.getProductName().toLowerCase().contains(searchInput.toLowerCase())).collect(Collectors.toList());
	}
	/* (non-Javadoc)
	 * @see com.cs545.ecommerce.repository.ProductRepository#getProductsByMainCat(java.lang.String)
	 */
	public List<Product> getProductsByMainCat(String mainCatName){
		List<Product> matchingProducts = new ArrayList<Product>();
		for(Product product : listOfProduct){
			if(product.getCategory().getSubCategoryOf().equals(mainCatName)){
				matchingProducts.add(product);
			}						
		}
		return matchingProducts;
		
	}
}
