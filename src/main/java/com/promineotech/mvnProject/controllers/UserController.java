package com.promineotech.mvnProject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class UserController {
	
	@Autowired
	UsersService service; 

}
