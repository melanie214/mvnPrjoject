package com.promineotech.mvnProject.service;

import com.promineotech.mvnProject.entity.User;

public class UsersService {
	//create author 
	//create book
	//view user account 
	//approve or deny requests 
	//view all books checked out with date and late fees
	//mark fee paid 
	// create user, register account 
	// user can log in after registering 
	// user can check out books 
	// user can return books 
	// user is given a late fee, if books are returned late 
	// user can view check out history 
	
	
	//create author 
	public User createAuthor(User author) {
		return repo.save(author); 
	}
	
	//create book 
	public User createBook(User book) {
		return repo.save(book);
	}
	
	
	
	

}
