package com.loanmanagment.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigationController {

	@GetMapping("/dashboard")
	public String userDash() {
		return "DashBoard";
	}
	
}
