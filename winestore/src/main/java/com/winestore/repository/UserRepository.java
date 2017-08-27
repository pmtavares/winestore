package com.winestore.repository;

import org.springframework.data.repository.CrudRepository;

import com.winestore.model.User;

public interface UserRepository extends CrudRepository<User, Long>{
	User findByUsername(String username);
	
}
