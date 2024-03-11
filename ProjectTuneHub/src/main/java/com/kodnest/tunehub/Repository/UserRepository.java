package com.kodnest.tunehub.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodnest.tunehub.Entity.User;

public interface UserRepository 
extends JpaRepository<User, String>{

	public User findByEmail(String email);

}