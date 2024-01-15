package com.as.mobileappws.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
/**
 * The UserEntity class represents the entity for user-related data in the application.
 * It is mapped to the "user" table in the database.
 */
@Entity
@Table(name="user")
public class UserEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private long id;
	@Column(nullable = false)
	private String userId;
	@Column(nullable = false,length = 50)
	private String firstname;
	@Column(nullable = false,length = 50)
	private String lastname;
	//	@Column(name ="email",nullable = false,length = 120,unique=true)
	@Column(name ="email",nullable = false,length = 120)
	private String email;
	@Column(nullable = false)
	private String encryptedpassword;
	private String emailVerificationToken;
	@Column(nullable = false)
	private Boolean emailVerificationStatus = false;
	
	 /**
     * Constructs a new UserEntity with the provided parameters.
     *
     * @param id                       The unique identifier of the user.
     * @param userId                   The unique user ID.
     * @param firstname                The first name of the user.
     * @param lastname                 The last name of the user.
     * @param email                    The email address of the user.
     * @param encryptedPassword        The encrypted password of the user.
     * @param emailVerificationToken   The token used for email verification.
     * @param emailVerificationStatus  The status of email verification.
     */
	
	public UserEntity(long id, String userId, String firstname, String lastname, String email, String encryptedpassword,
			String emailVerificationToken, Boolean emailVerificationStatus) {
		super();
		this.id = id;
		this.userId = userId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.encryptedpassword = encryptedpassword;
		this.emailVerificationToken = emailVerificationToken;
		this.emailVerificationStatus = emailVerificationStatus;
	}

    /**
     * Returns a string representation of the UserEntity.
     *
     * @return A string representation of the object.
     */
	
	@Override
	public String toString() {
		return "UserEntity {id=" + id + ", userId=" + userId + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", email=" + email + ", encryptedpassword=" + encryptedpassword + ", emailVerificationToken="
				+ emailVerificationToken + ", emailVerificationStatus=" + emailVerificationStatus + "}";
	}  
	/**
     * Default constructor for UserEntity.
     */
	public UserEntity() {
		super();
		
	}
	 // Getters and setters...

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
	
	
	
	

}
