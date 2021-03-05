package com.example.project.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateUserRequestDto {
	
	private Long cpf;
	private String firstName;
	private String email;

	public UpdateUserRequestDto(){

	}
	
	
	public UpdateUserRequestDto(
		@JsonProperty(value = "cpf",required = true) Long cpf ,
		@JsonProperty(value = "name", required = true)	String name,
		@JsonProperty(value = "email", required = true)	String email) {
		this.cpf = cpf;
		this.firstName = name;
		this.email = email;
	}


	public Long getCpf() {
		return cpf;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getEmail() {
		return email;
	}
	
	
	
	
	

}
