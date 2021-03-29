package com.example.project.domain;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(schema = "public", name = "user")
public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;

	@Column(name = "cpf")
	private Long cpf;

	@Column(name = "name")
	private String name;

	@Column(name = "email")
	private String email;

	public User() {

	}


	public User(String id, Long cpf, String name, String email) {
		this.id = id;
		this.cpf = cpf;
		this.name = name;
		this.email = email;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
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


