package com.promineotech.mvnProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.mvnProject.entity.User;
import com.promineotech.mvnProject.repository.UserRepository;



@Service 
public class UsersService {
	
	@Autowired
	UserRepository repo; 
	
	public User getUser(Long id) {
		return repo.findOne(id);
	}
	
	public Iterable<User> getUsers() {
		return repo.findAll();
		
	}
	
	public void deleteUser(Long id) {
		repo.delete(id);
		
	}
	
	public User updateUser(Long id, User user) {
		User foundUser= repo.findOne(id);
		if (foundUser != null) {
			foundUser.setUserName(user.getUserName());
			foundUser.setPassword(user.getPassword());
			repo.save(foundUser);
		}
		return foundUser;
	}
	
	public User createUser(User user) {
		return repo.save(user);
		
	}

	
	
	

}
