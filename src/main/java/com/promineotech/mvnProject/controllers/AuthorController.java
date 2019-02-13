package com.promineotech.mvnProject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.mvnProject.entity.Author;
import com.promineotech.mvnProject.service.AuthorsService;


@RestController
public class AuthorController {
	
	@Autowired
	AuthorsService service; 
	
	@RequestMapping(value="/authors", method=RequestMethod.POST)
	public Author addAuthor(@RequestBody Author author) {
		
		return service.createAuthor(author); 
	}
	
	@RequestMapping("/authors")
	public Iterable<Author>getAuthors() {
		return service.getAuthors();
		
	}
	
	@RequestMapping("/authors/{id}")
	public Author getAuthor(@PathVariable Long id) {
		return service.getAuthor(id); 
	}
	
	@RequestMapping(value="/authors/{id}", method=RequestMethod.PUT)
	public Author updateAuthor(@PathVariable Long id, @RequestBody Author author) {
		return service.updateAuthor(id, author);
	}
	
	@RequestMapping(value="/authors/{id}", method=RequestMethod.DELETE)
	public void deleteAuthor(@PathVariable Long id) {
		service.deleteAuthor(id);
	}

}
