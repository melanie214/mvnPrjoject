package com.promineotech.mvnProject.service;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.mvnProject.entity.Book;
import com.promineotech.mvnProject.repository.BookRepository;
import com.promineotech.mvnProject.repository.UserRepository;

@Service 
public class BooksService {
	
	
	@Autowired
	BookRepository repo;
	
	@Autowired
	UserRepository userRepo;
	
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
	
	public Book checkoutBook(Long userId, Long bookId) {
		Book book = repo.findOne(bookId);
		book.setUser(userRepo.findOne(userId));
		book.setDueDate(Date.valueOf(LocalDate.now().plusDays(7)));
		repo.save(book);
		return book;
	}
	
	public Book returnBook(Long userId, Long bookId) {
		Book book = repo.findOne(bookId);
		book.setUser(null);
		repo.save(book);
		return book; 
	}

}
