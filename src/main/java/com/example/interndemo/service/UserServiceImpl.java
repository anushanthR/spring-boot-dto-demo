package com.example.interndemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.interndemo.entity.User;
import com.example.interndemo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public boolean createUser(User user) {
		userRepository.save(user);
		return true;
	}

	@Override
	public User getOneUser(Integer id) {
		
		//return userRepository.getOne(id);
		//return userRepository.findById(id).get();
		return userRepository.findById(id).orElse(null);
	}

	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();		
	}

	@Override
	public boolean updateUser(Integer id, User user) {
		if(userRepository.getOne(id) !=null) {
			user.setId(id);
			userRepository.save(user);
			return true;
		}
		return false;
	}

	@Override
	public boolean dropUser(Integer id) {
		userRepository.deleteById(id);
		return true;
	}

	
}
