package com.project.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.project.java.model.User;
import com.project.java.model.UserRepo;

@Controller
public class LoginController {
	
	@Autowired
	private UserRepo userRepo;

	
	 RestTemplate restTemplate = new RestTemplate();
	
	@RequestMapping("/")
	public String checkMVC() {
		return "login";
	}
	
	@RequestMapping("/login")
	public String loginHomePage(@RequestParam("userName") String userName,@RequestParam("password") String password,Model model) {
		User u = null;
		try {
			u=userRepo.findByName(userName);
		}
		catch(Exception e) {
			System.out.println("User Not Found !!!");
		}
		if (u!=null) {
		model.addAttribute("UserName",userName);
		return "homePage";
	}
		model.addAttribute("error","User not found,Kindly Register !!!");
		return "login";
}
	@RequestMapping("/register")
	public String goToRegistrationPage() {
		return "register";
	}
	@RequestMapping("/set-user")
	public String goToRegistrationMicroservice(@RequestParam("userName") String userName,@RequestParam("password") String password,
			@RequestParam("password1") String password1,Model model) {
		System.out.println("=============Going to Registration Microservice from Login Microservice - START");
		if(password.equals(password1)) {
			restTemplate.getForObject("http://localhost:8081/register-user/"+userName+"/"+password+"", String.class);
			model.addAttribute("registrationSuccess","Successfully Registered,Kindly Login");
		}
		else {
			model.addAttribute("registrationError","Password not same!!!");
		}
		System.out.println("=============Registration Microservice from Login Microservice - END");

		return "login";
	}
}