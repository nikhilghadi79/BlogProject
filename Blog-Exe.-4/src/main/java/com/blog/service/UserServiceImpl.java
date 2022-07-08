package com.blog.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.exceptions.*;

import com.blog.dao.UserDao;
import com.blog.entity.User;
import com.blog.payloads.UserDto;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public UserDto createUser(UserDto userDto) {
		User user =this.dtoToUser(userDto);
		User saveUser = this.userDao.save(user);
		
		return this.userToDro(saveUser);
	}

	@Override
	public UserDto updateUser(UserDto userDto, Integer userId) {
		User user=this.userDao.findById(userId).orElseThrow(()-> new ResourseNotFoundException("User","id", userId));
	
		user.setId(userDto.getId());
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		user.setAboute(userDto.getAboute());
		User save = this.userDao.save(user);
		UserDto userDto1 = this.userToDro(save);
		
		return userDto1;
	}

	@Override
	public UserDto getUserById(Integer userId) {
		User user=this.userDao.findById(userId).orElseThrow(()-> new ResourseNotFoundException("User","id", userId));
		
		return this.userToDro(user);
	}

	@Override
	public List<UserDto> getAllUsers() {
	List<User> findAll = this.userDao.findAll();
	List<UserDto> userDtos = findAll.stream().map(user ->this.userToDro(user)).collect(Collectors.toList());
		return userDtos;
	}

	@Override
	public void deleteUser(Integer userId) {
		
		User user=this.userDao.findById(userId).orElseThrow(()-> new ResourseNotFoundException("User","id", userId));
		
		this.userDao.delete(user);
	}
	
	public User dtoToUser(UserDto userDto) {
		User user =this.modelMapper.map(userDto, User.class);
		
//		user.setId(userDto.getId());
//		user.setName(userDto.getName());
//		user.setEmail(userDto.getEmail());
//		user.setPassword(userDto.getPassword());
//		user.setAboute(userDto.getAboute());
		return user;
	
		
	}
	
	public UserDto userToDro(User user) {
		UserDto dto=this.modelMapper.map(user, UserDto.class);
		
//		dto.setId(user.getId());
//		dto.setName(user.getName());
//		dto.setEmail(user.getEmail());
//		dto.setPassword(user.getPassword());
//		dto.setAboute(user.getAboute());
		return dto;
	}

}
