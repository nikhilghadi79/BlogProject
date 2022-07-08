package com.blog.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.entity.User;

public interface UserDao extends JpaRepository<User, Integer> {

}
