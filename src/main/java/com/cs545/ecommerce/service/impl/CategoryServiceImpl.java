package com.cs545.ecommerce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs545.ecommerce.domain.Category;
import com.cs545.ecommerce.repository.CategoryRepository;

import com.cs545.ecommerce.service.CategoryService;
@Service
public class CategoryServiceImpl implements CategoryService{
@Autowired
private CategoryRepository repository;
	@Override
	public List<Category> getAllCategories() {
		return repository.getAllCategories();
	}

}
