package com.as.mobileappws.entity.response;

public class UserResponseModel {
	
	private String userId;
	private String firstname;
	private String lastname;
	private String email;
	public UserResponseModel(String userId, String firstname, String lastname, String email) {
		super();
		this.userId = userId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
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
	@Override
	public String toString() {
		return "UserResponseModel : userId=" + userId + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", email=" + email  ;
	}
	public UserResponseModel() {
		super();
	}
	 
}
