package com.example.project.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateUserRequestDto {
	
	private Long cpf;
	private String fistName;
	private String email;

	public UpdateUserRequestDto(){

	}
	
	
	public UpdateUserRequestDto(
		@JsonProperty(value = "cpf",required = true) Long cpf ,
		@JsonProperty(value = "name", required = true)	String name,
		@JsonProperty(value = "email", required = true)	String email) {
		this.cpf = cpf;
		this.fistName = name;
		this.email = email;
	}


	public Long getCpf() {
		return cpf;
	}


	public String getFistName() {
		return fistName;
	}


	public String getEmail() {
		return email;
	}
	
	
	
	
	

}