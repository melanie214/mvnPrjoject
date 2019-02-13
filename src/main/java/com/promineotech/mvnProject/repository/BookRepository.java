package com.promineotech.mvnProject.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.mvnProject.entity.Book;




public interface BookRepository extends CrudRepository<Book, Long> {
	
	}
