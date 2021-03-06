package com.example.project.dto;


import com.example.project.domain.User;




public class UserDto {
	
	private String id;
	private Long cpf;
	private String name;
	private String email;

	public UserDto(){

	}


	public UserDto(String id,Long cpf ,String name, String email) {
		this.id = id;
		this.cpf= cpf;
		this.name = name;
		this.email = email;
	}
	public User teste(){
	    return new User(id, cpf,name, email);
	}


	public void setId(String id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

}