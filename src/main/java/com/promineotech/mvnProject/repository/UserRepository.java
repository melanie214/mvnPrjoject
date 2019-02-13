package com.promineotech.mvnProject.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.mvnProject.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
