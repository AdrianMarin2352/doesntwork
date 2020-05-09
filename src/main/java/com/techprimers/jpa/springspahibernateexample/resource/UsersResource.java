package com.techprimers.jpa.springspahibernateexample.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techprimers.jpa.springspahibernateexample.model.Users;
import com.techprimers.jpa.springspahibernateexample.repository.UsersRepository;

@RestController
@RequestMapping("/rest/users")
public class UsersResource {
	
	UsersRepository usersRepository;

	
	@GetMapping("/all")
	public List<Users> getAll(){
		return usersRepository.findAll();
		
	}
}