package com.loanmanagment.webapp.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

public class UserDto {
	
	@NotEmpty
	private String email;
	@Pattern(regexp="^\\p{L}+[\\p{L}\\p{Z}\\p{P}]{0,}",message="Please Enter a valid First Name")
	private String firstname;
	@Pattern(regexp="^\\p{L}+[\\p{L}\\p{Z}\\p{P}]{0,}",message="Please Enter a valid Last Name")
	private String lastname;
	@Pattern(regexp="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",message="Password must be at least 8 characters long & must contain at least one Uppercase Letter, Lowercase Letter, Special Character, Number")
	private String password;
	private String role;

	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
