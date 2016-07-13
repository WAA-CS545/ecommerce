/**
 * 
 */
package com.cs545.ecommerce.repository;

import java.util.List;

import com.cs545.ecommerce.domain.Category;
import com.cs545.ecommerce.domain.Product;

/**
 * @author Solomon Kassahun
 *
 */
public interface CategoryRepository {
	
	List<String> getAllCategoryNames();
	List<Category> getAllCategories();
	List<String> getCategorNamesIn(String mainCategoryName);
	Category getCategoryByName(String name);


}
