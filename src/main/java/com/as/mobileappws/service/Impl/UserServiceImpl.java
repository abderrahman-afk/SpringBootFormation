package com.as.mobileappws.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.as.mobileappws.dto.UserDto;
import com.as.mobileappws.repo.UserRepository;
import com.as.mobileappws.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDto createUser(UserDto userdto) {
		// TODO Auto-generated method stub
		return null;
	}

}
