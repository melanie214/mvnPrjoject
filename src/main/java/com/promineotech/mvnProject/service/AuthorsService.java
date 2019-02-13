package com.promineotech.mvnProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.mvnProject.entity.Author;
import com.promineotech.mvnProject.repository.AuthorRepository;

@Service
public class AuthorsService {
	
	@Autowired
	AuthorRepository repo; 
	
	public Author getAuthor(Long id) {
		return repo.findOne(id); 
	}

	public Iterable<Author> getAuthors() {
		return repo.findAll(); 
		
	}
	
	public void deleteAuthor(Long id) {
		repo.delete(id); 
	}
	
	public Author updateAuthor(Long id, Author author) {
		Author foundAuthor = repo.findOne(id);
		if (foundAuthor != null) {
			foundAuthor.setFirstName(author.getFirstName());
			foundAuthor.setLastName(author.getLastName());
			foundAuthor.setTitle(author.getTitle());
			repo.save(foundAuthor);
		}
		
		return foundAuthor; 
	}
	
	public Author createAuthor(Author author) {
		return repo.save(author);
	}
	
	
}
