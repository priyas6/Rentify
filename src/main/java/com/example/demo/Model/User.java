package com.example.demo.Model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
   public User(long userId, String email) {
		super();
		this.userId = userId;
		this.email = email;
	}
@Id 
   @GeneratedValue(strategy=GenerationType.AUTO)
   private long userId;
   private String firstName;
   private String phoneNumber;
   private int userType;
   private String password;
   private String lastName;
   private String email;
   
   public User(long userId, String firstName, String lastName, String email, String phoneNumber, int userType,
		String password) {
	super();
	this.userId = userId;
	this.setFirstName(firstName);
	this.lastName = lastName;
	this.email = email;
	this.phoneNumber = phoneNumber;
	this.userType = userType;
	this.password = password;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public int getUserType() {
	return userType;
}
public void setUserType(int userType) {
	this.userType = userType;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public void setPassword(String password) {
	this.password = password;
}
public void setEmail(String email) {
	this.email = email;
}
public User(String UserName,String Password)
{
	this.email=UserName;
	this.password=Password;
}
public User(long UserId)
{
	this.userId=UserId;
}
public User() {
	super();
}
public long getUserId() {
	return userId;
}
public void setUserId(long userId) {
	this.userId = userId;
}
public String getPassword() {
	return password;
}

   public String getEmail() 
   {
	return email;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
}
