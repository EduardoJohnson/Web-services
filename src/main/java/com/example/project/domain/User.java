package com.example.project.domain;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(schema = "public",name = "user")
public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Long cpf;
	private String name;
	private String email;

	public User() {

	}


	public User(Long id, Long cpf, String name, String email) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.name = name;
		this.email = email;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



}


