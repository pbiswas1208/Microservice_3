package com.project.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.java.model.User;
import com.project.java.model.UserRepo;

@RestController
public class RegistrationController {

	@Autowired
	private UserRepo userRepo;

	@RequestMapping("/check")
	public String registerCheck() {
		return "check Register";
	}
	@RequestMapping("/register-user/{userName}/{password}")
	public String registerUser(@PathVariable("userName") String userName,@PathVariable("password") String password) {
		System.out.println("=============In Registration Microservice from Login Microservice - START");

		User u = new User();
		u.setId(null);
		u.setName(userName);
		u.setPassword(password);
		userRepo.save(u);
		System.out.println("=============In Registration Microservice from Login Microservice - END");

		return "Succesfully Registered";
	}
}
