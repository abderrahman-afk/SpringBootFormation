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
/**
 * The UserController class handles HTTP requests related to user operations.
 * It contains methods for retrieving, creating, updating, and deleting users.
 */
@RestController
@RequestMapping("users")
public class UserController {

    /**
     * The userService is autowired to handle business logic related to users.
     */
    @Autowired
    private UserService userService;

    /**
     * Retrieves a list of users.
     *
     * @return A string indicating the operation's success. (Placeholder response)
     */
    @GetMapping
    public String getUser() {
        return "get user";
    }

    /**
     * Creates a new user based on the provided user details.
     *
     * @param userDetailsRequestModel The details of the user to be created.
     * @return A UserResponseModel representing the newly created user.
     */
    @PostMapping
    public UserResponseModel createUser(@RequestBody UserRequestModel userDetailsRequestModel) {

        // Initialize objects for request and response
        UserResponseModel resultUser = new UserResponseModel();
        UserDto userDto = new UserDto();

        // Copy properties from the request to the DTO
        BeanUtils.copyProperties(userDetailsRequestModel, userDto);

        // Call the userService to create the user
        UserDto createdUser = userService.createUser(userDto);

        // Copy properties from the created user to the response
        BeanUtils.copyProperties(createdUser, resultUser);

        // Return the response
        return resultUser;
    }

    /**
     * Updates an existing user.
     *
     * @return A string indicating the operation's success. (Placeholder response)
     */
    @PutMapping
    public String updateUser() {
        return "update user";
    }

    /**
     * Deletes an existing user.
     *
     * @return A string indicating the operation's success. (Placeholder response)
     */
    @DeleteMapping
    public String deleteUser() {
        return "delete user";
    }
}
