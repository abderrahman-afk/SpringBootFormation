package com.as.mobileappws.dto;

import java.io.Serializable;
/**
 * The UserDto class represents the Data Transfer Object (DTO) for user-related information.
 * It is used to transfer user data between the controller layer and the service layer.
 */
public class UserDto implements Serializable {
 

	private static final long serialVersionUID = -9008302099703852929L;
	private long id;
	private String userId;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private String encryptedpassword;
	private String emailVerificationToken;
	private Boolean emailVerificationStatus = false;
	
	
	
	
	public long getId() {
		return id;
	}




	public void setId(long id) {
		this.id = id;
	}




	public String getUserId() {
		return userId;
	}




	public void setUserId(String userId) {
		this.userId = userId;
	}




	public String getFirstname() {
		return firstname;
	}




	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}




	public String getLastname() {
		return lastname;
	}




	public void setLastname(String lastname) {
		this.lastname = lastname;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public String getEncryptedpassword() {
		return encryptedpassword;
	}




	public void setEncryptedpassword(String encryptedpassword) {
		this.encryptedpassword = encryptedpassword;
	}




	public String getEmailVerificationToken() {
		return emailVerificationToken;
	}




	public void setEmailVerificationToken(String emailVerificationToken) {
		this.emailVerificationToken = emailVerificationToken;
	}




	public Boolean getEmailVerificationStatus() {
		return emailVerificationStatus;
	}




	public void setEmailVerificationStatus(Boolean emailVerificationStatus) {
		this.emailVerificationStatus = emailVerificationStatus;
	}




	public static long getSerialversionuid() {
		return serialVersionUID;
	}




	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}




	public UserDto(long id, String userId, String firstname, String lastname, String email, String password,
			String encryptedpassword, String emailVerificationToken, Boolean emailVerificationStatus) {
		super();
		this.id = id;
		this.userId = userId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.encryptedpassword = encryptedpassword;
		this.emailVerificationToken = emailVerificationToken;
		this.emailVerificationStatus = emailVerificationStatus;
	}




	@Override
	public String toString() {
		return "UserDto  id=" + id + ", userId=" + userId + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", email=" + email + ", password=" + password + ", encryptedpassword=" + encryptedpassword
				+ ", emailVerificationToken=" + emailVerificationToken + ", emailVerificationStatus="
				+ emailVerificationStatus  ;
	}

}
