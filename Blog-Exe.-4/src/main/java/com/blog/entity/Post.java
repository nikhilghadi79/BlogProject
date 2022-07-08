package com.blog.entity;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Post {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer postId;
	
	@Column(length = 100)
	private String postTitel;
	@Column(length = 10000)
	private String postContent;
	@Column(length = 25)
	private String imageName;
	private Date addedDate;
	
	@ManyToOne
	private Category category;
	
	@ManyToOne
	private User user;

	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Post(Integer postId, String postTitel, String postContent, String imageName, Date addedDate,
			Category category, User user) {
		super();
		this.postId = postId;
		this.postTitel = postTitel;
		this.postContent = postContent;
		this.imageName = imageName;
		this.addedDate = addedDate;
		this.category = category;
		this.user = user;
	}

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
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

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

}
