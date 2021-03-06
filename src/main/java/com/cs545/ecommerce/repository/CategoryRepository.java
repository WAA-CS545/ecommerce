/**
 * 
 */
package com.cs545.ecommerce.repository;

import java.util.List;

import com.cs545.ecommerce.domain.Category;

/**
 * @author Solomon Kassahun
 *
 */
public interface CategoryRepository {
	
	List<String> getAllCategoryNames();
	List<Category> getAllCategories();
	List<String> getCategorNamesIn(String mainCategoryName);
	Category getCategoryByName(String name);
	boolean isExistCategory(String categoryName);
	List<Category> getCategoriesByMainCategory(String mainCategory);

}
