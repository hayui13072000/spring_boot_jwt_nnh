package com.example.spring_boot_jwt_nnh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_boot_jwt_nnh.entity.User;
import com.example.spring_boot_jwt_nnh.repository.UserRepository;
import com.example.spring_boot_jwt_nnh.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
    private UserRepository userRepository;
	
	@Override
	public User createUser(User user) {
		return userRepository.saveAndFlush(user);
	}

}
