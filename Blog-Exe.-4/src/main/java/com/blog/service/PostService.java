package com.blog.service;

import java.util.List;

import com.blog.entity.Post;
import com.blog.payloads.PostDto;

public interface PostService {

	// create 
	
	PostDto createPost(PostDto postDto,Integer userId, Integer categoryId);
	
	//update
	
	PostDto updatPost(PostDto postDto, Integer postId);
	
	//delete 
	
	void deletePost(Integer postId);
	
	//get all post
	
	List<PostDto> getallPost();
	
	//get post by id 
	
	PostDto getPostById(Integer postId);
	
	// get all post by category
	
	List<PostDto> getPostsBycategory(Integer categoryId);
	
	//get all posts by user
	
	List<PostDto> getPostsByUser(Integer userId);
	
	// search posts 
	
	List<Post> searchPosts(String keyword);
	
}
