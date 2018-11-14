package com.example.interndemo.service;

import java.util.List;

import com.example.interndemo.entity.User;


public interface UserService {
	
	boolean createUser(User user);
	User getOneUser(Integer id);
	List<User> getAllUser();
	boolean updateUser(Integer id , User user);
	boolean dropUser(Integer id);
}
