package com.promineotech.mvnProject.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	
	private Long id; 
	private String userName; 
	private String password;
	
	private List<Book> books;
	
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}




	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}




	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@OneToMany(mappedBy = "user")
	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	} 
	

}
