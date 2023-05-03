package com.loanmanagment.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.loanmanagment.webapp.dto.UserDto;
import com.loanmanagment.webapp.entities.AppUser;
import com.loanmanagment.webapp.services.UserService;

import jakarta.validation.Valid;

@Controller
public class AuthenticationController {
	
	private UserService userserv;
	
	public AuthenticationController(UserService userserv) {
		this.userserv=userserv;
	}
	
	@GetMapping("/login")
	public String loginPage() {
		return "Login";
	}
	@GetMapping("/register")
	public String registrationForm(Model mod) {
		UserDto userdto=new UserDto();
		mod.addAttribute("user", userdto);
		return "Register";
	}
	 
	@PostMapping("/register")
	public String registerUser(@Valid @ModelAttribute("user")UserDto userdto,BindingResult bindingresults,Model mod)  {
		AppUser existinguser=new AppUser();
		existinguser=userserv.findByEmail(userdto.getEmail());
		if(existinguser!=null) {
			return "redirect:/register?fail";
		}
		if(bindingresults.hasErrors()) {
			mod.addAttribute("user",userdto);
			return "Register";
		}
		userserv.saveUser(userdto);
		return "redirect:/dashboard?registersuccess";
	}
}
