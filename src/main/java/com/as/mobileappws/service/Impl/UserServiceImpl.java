package com.as.mobileappws.service.Impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.as.mobileappws.dto.UserDto;
import com.as.mobileappws.entity.UserEntity;
import com.as.mobileappws.repo.UserRepository;
import com.as.mobileappws.service.UserService;
import com.as.mobileappws.shared.Utiltool;

/**
 * The UserServiceImpl class implements the UserService interface and
 * provides the business logic for user-related operations.
 */
@Service
public class UserServiceImpl implements UserService {

    /**
     * The userRepository is autowired to interact with the user database.
     */
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private Utiltool utiltool;
    @Autowired
    private BCryptPasswordEncoder bCryptEncoder;

    /**
     * Creates a new user based on the provided user DTO.
     *
     * @param userDto The DTO containing user details for creation.
     * @return A UserDto representing the newly created user.
     */
    @Override
    public UserDto createUser(UserDto userDto) {

    	 
    	 if(userRepository.findByEmail(userDto.getEmail()) != null )     throw new RuntimeException("User with email " + userDto.getEmail() + " already exists.");

    	
        // Initialize objects for entity and response
        UserEntity userEntity = new UserEntity();
        String publicId = utiltool.generateUserId(30);
        BeanUtils.copyProperties(userDto, userEntity);

        // Set default values (for example purposes)
        userEntity.setEncryptedpassword(bCryptEncoder.encode(userDto.getPassword()));
        
        userEntity.setUserId(publicId);

        // Save the user entity to the database
        UserEntity createdUserEntity = userRepository.save(userEntity);

        // Initialize object for response
        UserDto userReturned = new UserDto();

        // Copy properties from the created user entity to the response DTO
        BeanUtils.copyProperties(createdUserEntity, userReturned);

        // Return the response
        return userReturned;
    }
}
