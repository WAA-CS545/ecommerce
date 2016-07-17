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
		mainCategories.add("Matrices");
		
		
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
		Category category12 = new Category("Matrices", "Tribica");
		Category category13 = new Category("Matrices", "Clarica");
		Category category14 = new Category("Matrices", "Colormate");
		Category category15 = new Category("Matrices", "Herlequin");
		Category category16 = new Category("Matrices", "Littlehome");
		Category category17 = new Category("Matrices", "Clarissa");
		Category category18 = new Category("Matrices", "Essential");
		Category category19 = new Category("Matrices", "Tribecalliving");
		
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
		categories.add(category12);
		categories.add(category13);
		categories.add(category14);
		categories.add(category15);
		categories.add(category16);
		categories.add(category17);
		categories.add(category18);
		categories.add(category19);
	}

	/* (non-Javadoc)
	 * @see com.cs545.ecommerce.repository.CategoryRepository#getAllCategoryNames()
	 */
	@Override
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
	@Override
	public List<Category> getAllCategories() {	
		return categories;
	}

	/* (non-Javadoc)
	 * @see com.cs545.ecommerce.repository.CategoryRepository#getCategorNamesIn(java.lang.String)
	 */
	@Override
	public List<String> getCategorNamesIn(String mainCategoryName) {
		List <String> categoryNames = new ArrayList<String>();
		for(Category category: categories){
			if(category.getSubCategoryOf().equals(mainCategoryName)){
				categoryNames.add(category.getCategoryName());				
			}
			
		}
		return categoryNames;
	}
	@Override
	public Category getCategoryByName(String categoryName){		
		for(Category cat:categories){
			if(cat.getCategoryName().equals(categoryName)){
				return cat;				
			}	
		}
		return null;
	}
	@Override
	public boolean isExistCategory(String categoryName) {
		for(Category cat:categories){
			if(cat.getCategoryName().equals(categoryName)) return true;
		}
		return false;
	}

	@Override
	public List<Category> getCategoriesByMainCategory(String mainCategory) {
		List<Category> cats=new ArrayList<>();
		for(Category c:categories){
			if(c.getSubCategoryOf().equals(mainCategory)) cats.add(c);
		}
		return cats;
	}

	

}
