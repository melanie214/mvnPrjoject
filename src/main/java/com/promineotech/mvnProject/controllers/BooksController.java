package com.promineotech.mvnProject.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.mvnProject.entity.Book;
import com.promineotech.mvnProject.service.BooksService;


@RestController
public class BooksController {
	
	@Autowired
	BooksService service; 
	
	@RequestMapping(value="/books", method=RequestMethod.POST)
	public Book addBook(@RequestBody Book book) {
		
		return service.createBook(book);  
	}
	
	@RequestMapping("/books")
	public Iterable<Book>getBooks() {
		return service.getBooks(); 
	}
	
	@RequestMapping("/books/{id}")
	public Book getBook(@PathVariable Long id) {
		return service.getBook(id);
	}
	
	@RequestMapping(value="/books/{id}" , method=RequestMethod.PUT)
	public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
		return service.updateBook(id, book);
	}
	
	@RequestMapping(value="/books/{id}" , method=RequestMethod.DELETE)
	public void deleteBook(@PathVariable Long id) {
		service.deleteBook(id);
	}
	
}