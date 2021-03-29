package com.example.project.service;

import java.util.List;

import com.example.project.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.domain.User;
import com.example.project.dto.UpdateUserRequestDto;

import com.example.project.repository.UserRepository;

@Service
public class UserService {
	
	
	@Autowired
	private UserRepository repo;
	@Autowired
	private UserMapper userMapper;

	public UserService(UserRepository userRepository,UserMapper userMapper){
		this.repo = userRepository;
		this.userMapper = userMapper;

	}

	public String save(User user){
	
		repo.save(user);
		return "inserido com felicidade";
	}

	public List<User> listUser(){
		return repo.findAll();
	}
	
	public User update(String id ,UpdateUserRequestDto user){
		
		Long cpf = user.getCpf();
		String name = user.getName();
		String email = user.getEmail();
		
		User recuperar = repo.findById(id).get();
			recuperar.setCpf(cpf);
			recuperar.setName(name);
			recuperar.setEmail(email);
		return repo.save(recuperar);
		 	
		 }
	


	public User filterId(String id) {
	
	    return repo.findById(id).get();
	}

	
	public void delete(String id) {
		 repo.deleteById(id);
	}
	

}