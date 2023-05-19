package com.user.preassignments.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User")
public class Users {
	@Id
	private int id;
	private String dateOfBirth;
	private String name;
	private String userName;

	public Users(int id, String dateOfBirth, String name, String userName) {
		super();
		this.id = id;
		this.dateOfBirth = dateOfBirth;
		this.name = name;
		this.userName = userName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", dateOfBirth=" + dateOfBirth + ", name=" + name + ", userName=" + userName + "]";
	}

}
