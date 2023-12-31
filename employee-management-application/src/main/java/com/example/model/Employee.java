package com.example.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "data")
public class Employee {

	private long id ;
	private String firstName;
	private String lastName;
	private String emailId;
	
	public Employee(String firstName, String lastName, String emailId) 
	{

		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		System.out.print("here");
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
}
