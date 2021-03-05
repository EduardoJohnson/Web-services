package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.domain.User;
import com.example.project.dto.UpdateUserRequestDto;

import com.example.project.repository.UserRepository;

@Service
public class UserService {
	




	private UserRepository repo;

	public UserService(UserRepository userRepository){
		this.repo = userRepository;
	}

	public String save(User user){
	
		repo.save(user);
		return "inserido com felicidade";
	}

	public List<User> listUser(){
		return repo.findAll();
	}
	
	public User update(Long id ,UpdateUserRequestDto user){
		
		Long cpf = user.getCpf();
		String name = user.getFirstName();
		String email = user.getEmail();
		
		User recuperar = repo.findById(id).get();
			recuperar.setCpf(cpf);
			recuperar.setName(name);
			recuperar.setEmail(email);
		return repo.save(recuperar);
		 	
		 }
	


	public User filterId(Long id) {
	
	    return repo.findById(id).get();
	}

	
	public void delete(Long id) {
		 repo.deleteById(id);
	}
	

}