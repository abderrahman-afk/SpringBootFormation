package com.as.mobileappws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.as.mobileappws.dto.UserDto;
import com.as.mobileappws.entity.request.UserRequestModel;
import com.as.mobileappws.entity.response.UserResponseModel;
import com.as.mobileappws.service.UserService;

@RestController
@RequestMapping("users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping
	public String getUser() {
		return "get user ";
	}
	@PostMapping
	public UserResponseModel createtUser(@RequestBody UserRequestModel userDetailsRequestModel  ) {
		
		UserResponseModel ResultUser = new UserResponseModel();
		UserDto  userdto = new UserDto();
		BeanUtils.copyProperties(userdto, userdto);	
		
	UserDto createduser = userService.createUser(userdto);
	BeanUtils.copyProperties(createduser, ResultUser);
		
		 
		
		
		return ResultUser;
	}

	@PutMapping
	public String updateUser() {
		return "get user ";
	}
	@DeleteMapping
	public String deleteUser() {
		return "get user ";
	}


}
