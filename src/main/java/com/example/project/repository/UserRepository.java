package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.domain.User;



public interface UserRepository extends JpaRepository<User, String> {
	
}