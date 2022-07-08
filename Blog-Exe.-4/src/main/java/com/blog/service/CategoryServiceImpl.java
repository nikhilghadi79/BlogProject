package com.blog.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.dao.CategoryRepo;
import com.blog.entity.Category;
import com.blog.exceptions.ResourseNotFoundException;
import com.blog.payloads.CategoryDto;
@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryRepo categoryRepo;
	
	@Autowired
	private ModelMapper modelMapper;

	// create category
	@Override
	public CategoryDto createCategory(CategoryDto categoryDto) {
		Category map = this.modelMapper.map(categoryDto, Category.class);
		Category save = this.categoryRepo.save(map);
		return this.modelMapper.map(save, CategoryDto.class);
		
	}

	// update category
	@Override
	public CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId) {
		Category cat= this.categoryRepo.findById(categoryId).orElseThrow(()-> new ResourseNotFoundException("Category","CategoryId",categoryId));
		cat.setCategoryTitel(categoryDto.getCategoryTitel());
		cat.setCategoryDescription(categoryDto.getCategoryDescription());
		
		Category save = this.categoryRepo.save(cat);
		return this.modelMapper.map(save, CategoryDto.class);
	
		
	}
	// delete category

	@Override
	public void deleteCategory(Integer categoryId) {
	Category cat=this.categoryRepo.findById(categoryId).orElseThrow(()-> new ResourseNotFoundException("Category","CategoryId",categoryId));
	this.categoryRepo.delete(cat);
	}

	// get one category through id 
	@Override
	public CategoryDto getCategory(Integer categoryId) {
	 Category cat=	this.categoryRepo.findById(categoryId).orElseThrow(()-> new ResourseNotFoundException("Category","CategoryId",categoryId));
		return this.modelMapper.map(cat, CategoryDto.class);
	}

	@Override
	public List<CategoryDto> getAllCategory() {
		 List<Category> all = this.categoryRepo.findAll();
		 List<CategoryDto> list = all.stream().map(e-> this.modelMapper.map(e, CategoryDto.class)).collect(Collectors.toList());
		return list;
	}

}
