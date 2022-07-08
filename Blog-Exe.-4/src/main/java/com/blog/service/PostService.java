package com.blog.service;

import java.util.List;

import com.blog.entity.Post;
import com.blog.payloads.PostDto;

public interface PostService {

	// create 
	
	PostDto createPost(PostDto postDto,Integer userId, Integer categoryId);
	
	//update
	
	Post updatPost(PostDto postDto, Integer postId);
	
	//delete 
	
	void deletePost(Integer postId);
	
	//get all post
	
	List<Post> getallPost();
	
	//get post by id 
	
	Post getPostById(Integer postId);
	
	// get all post by category
	
	List<Post> getPostsBycategory(Integer categoryId);
	
	//get all posts by user
	
	List<Post> getPostsByUser(Integer userId);
	
	// search posts 
	
	List<Post> searchPosts(String keyword);
	
}
