package com.promineotech.mvnProject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.mvnProject.entity.Book;
import com.promineotech.mvnProject.entity.User;
import com.promineotech.mvnProject.service.BooksService;
import com.promineotech.mvnProject.service.UsersService;

@RestController 
public class UserController {
	
	@Autowired
	UsersService service; 
	
	@Autowired
	BooksService booksService;
	
	@RequestMapping(value="/users", method=RequestMethod.POST)
	public User addUser(@RequestBody User user) {
		
		return service.createUser(user);
	}
	
	@RequestMapping("/users")
	public Iterable<User>getUsers() {
		return service.getUsers();
	}
	
	@RequestMapping("/users/{id}")
	public User getUser(@PathVariable Long id) {
		return service.getUser(id);
	}
	
	@RequestMapping(value="/users/{id}" , method=RequestMethod.PUT)
	public User updateUser(@PathVariable Long id, @RequestBody User user) {
		return service.updateUser(id, user);
	}
	
	@RequestMapping(value="/users/{id}" , method=RequestMethod.DELETE)
	public void deleteUser(@PathVariable Long id) {
		service.deleteUser(id);
	}
	
	@RequestMapping(value="/users/{userId}/books/{bookId}", method=RequestMethod.PUT)
	public Book checkoutBook(@PathVariable Long userId, @PathVariable Long bookId) {
		return booksService.checkoutBook(userId, bookId);
	}

}
