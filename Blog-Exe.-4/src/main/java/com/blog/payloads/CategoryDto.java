package com.blog.payloads;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class CategoryDto {

	private Integer categoryId;
	@NotBlank
	@Size(min = 4,max = 9)
	private String categoryTitel;
	@NotBlank(message = "Description canNot be empty")
	@Size(min = 10, max = 100)
	private String categoryDescription;
	public CategoryDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CategoryDto(Integer categoryId, String categoryTitel, String categoryDescription) {
		super();
		this.categoryId = categoryId;
		this.categoryTitel = categoryTitel;
		this.categoryDescription = categoryDescription;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryTitel() {
		return categoryTitel;
	}
	public void setCategoryTitel(String categoryTitel) {
		this.categoryTitel = categoryTitel;
	}
	public String getCategoryDescription() {
		return categoryDescription;
	}
	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
	
	
	
}
