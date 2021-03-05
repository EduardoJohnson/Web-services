package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import com.example.project.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
}