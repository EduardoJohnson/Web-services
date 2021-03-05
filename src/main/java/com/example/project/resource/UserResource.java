package com.example.project.resource;

import com.example.project.domain.User;
import com.example.project.dto.UpdateUserRequestDto;
import com.example.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService service;

	@GetMapping("/person")
	public List<User> findAll() {
		return service.listUser();
	}

	@PostMapping("/person")
	public String save(@RequestBody User user) {
		return service.save(user);

	
	}

	@PutMapping("/person/{id}")
	public User att(@PathVariable(value = "id")Long id, @RequestBody UpdateUserRequestDto user) {
	
	return service.update(id,user);

	}

	@GetMapping("/person/{id}")
	public User filter(@PathVariable(value = "id") Long id, User user) {
	
		return service.filterId(id);
	}

	@DeleteMapping("/person/{id}")
	public void delete(@PathVariable(value = "id") Long id) {
		service.delete(id);

	}

}
