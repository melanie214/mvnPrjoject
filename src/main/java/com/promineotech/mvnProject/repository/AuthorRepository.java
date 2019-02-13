package com.promineotech.mvnProject.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.mvnProject.entity.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
