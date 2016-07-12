/**
 * 
 */
package com.cs545.ecommerce.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cs545.ecommerce.domain.Category;
import com.cs545.ecommerce.repository.CategoryRepository;

/**
 * @author Solomon Kassahun
 *
 */

@Repository
public class InMemoryCategoryRepository implements CategoryRepository {
	
	List<String> mainCategories;
	List<Category> categories;
	
	public InMemoryCategoryRepository(){
		mainCategories = new ArrayList<String>();
		categories = new ArrayList<Category>();
		mainCategories.add("Clothes");
		mainCategories.add("Shoes");
		mainCategories.add("Computers");
		mainCategories.add("Electronics");
		
		Category category1 = new Category("Clothes", "Men clothes");
		Category category2 = new Category("Clothes", "Women clothes");
		Category category3 = new Category("Clothes", "Children clothes");
		Category category4 = new Category("Shoes", "Men shoes");
		Category category5 = new Category("Shoes", "Women shoes");
		Category category6 = new Category("Shoes", "Children shoes");
		Category category7 = new Category("Computers", "PCs");
		Category category8 = new Category("Computers", "Laptops");
		Category category9 = new Category("Electronics", "Cell phones");
		Category category10 = new Category("Electronics", "Cell phone accessories");
		Category category11 = new Category("Electronics", "Tablets");
		
		categories.add(category1);
		categories.add(category2);
		categories.add(category3);
		categories.add(category4);
		categories.add(category5);
		categories.add(category6);
		categories.add(category7);
		categories.add(category8);
		categories.add(category9);
		categories.add(category10);
		categories.add(category11);
	}

	/* (non-Javadoc)
	 * @see com.cs545.ecommerce.repository.CategoryRepository#getAllCategoryNames()
	 */
	public List<String> getAllCategoryNames() {	
		List <String> categoryNames = new ArrayList<String>();
		for(Category category: categories){
			categoryNames.add(category.getCategoryName());
		}
		return categoryNames;
	}
	
	/* (non-Javadoc)
	 * @see com.cs545.ecommerce.repository.CategoryRepository#getAllCategories()
	 */
	public List<Category> getAllCategories() {	
		return categories;
	}

	/* (non-Javadoc)
	 * @see com.cs545.ecommerce.repository.CategoryRepository#getCategorNamesIn(java.lang.String)
	 */
	public List<String> getCategorNamesIn(String mainCategoryName) {
		List <String> categoryNames = new ArrayList<String>();
		for(Category category: categories){
			if(category.getSubCategoryOf().equals(mainCategoryName)){
				categoryNames.add(category.getCategoryName());				
			}
			
		}
		return categoryNames;
	}

}
