package com.promineotech.mvnProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.mvnProject.entity.Book;
import com.promineotech.mvnProject.repository.LibraryRepository;

@Service 
public class BooksService {
	
	
	@Autowired
	LibraryRepository repo; 
	
	public Book getBook(Long id) {
		return repo.findOne(id);
		
	}
	
	public Iterable<Book> getBooks() {
		return repo.findAll();
	}
	
	public void deleteBook(Long id) {
		repo.delete(id);
	}
	
	public Book updateBook(Long id, Book book) {
		Book foundBook= repo.findOne(id); 
		if (foundBook != null) {
			foundBook.setTitle(book.getTitle());
			foundBook.setAuthor(book.getAuthor());
			foundBook.setGenre(book.getGenre());
			repo.save(foundBook);
		}
		return foundBook; 
	}
	
	public Book createBook(Book book) {
		return repo.save(book); 
	}

}
