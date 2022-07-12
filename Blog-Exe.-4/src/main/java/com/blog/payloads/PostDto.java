package com.blog.payloads;

import java.util.Date;

import com.blog.entity.Category;
import com.blog.entity.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class PostDto {

	private int postId;

	private String postTitel;

	private String postContent;

	private String imageName;

	private Date addedDate;

	private CategoryDto category;

	private UserDto user;

	public PostDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
	public PostDto(int postId, String postTitel, String postContent, String imageName, Date addedDate,
			CategoryDto category, UserDto user) {
		super();
		this.postId = postId;
		this.postTitel = postTitel;
		this.postContent = postContent;
		this.imageName = imageName;
		this.addedDate = addedDate;
		this.category = category;
		this.user = user;
	}



	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getPostTitel() {
		return postTitel;
	}

	public void setPostTitel(String postTitel) {
		this.postTitel = postTitel;
	}

	public String getPostContent() {
		return postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public CategoryDto getCategory() {
		return category;
	}

	public void setCategory(CategoryDto category) {
		this.category = category;
	}

	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}

}
