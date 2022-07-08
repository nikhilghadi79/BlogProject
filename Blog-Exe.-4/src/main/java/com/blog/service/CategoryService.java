package com.blog.service;

import java.util.List;

import com.blog.payloads.CategoryDto;

public interface CategoryService {

	//create 
	
	CategoryDto createCategory(CategoryDto categoryDto);
	
	//update 
	
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
	
	
	//delete 
	
	void deleteCategory(Integer categoryId);
	
	// get one by id 
	
	CategoryDto getCategory(Integer categoryId);
	
	// get all through list
	
	List<CategoryDto> getAllCategory();
	
}
