package com.loanmanagment.webapp.servicesimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.loanmanagment.webapp.dto.UserDto;
import com.loanmanagment.webapp.entities.AppUser;
import com.loanmanagment.webapp.repositories.UserRepository;
import com.loanmanagment.webapp.services.UserService;

@Service
public class UserServiceImp implements UserService{
	
	private UserRepository userrepo;
	
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	public UserServiceImp(UserRepository userrepo,PasswordEncoder passwordEncoder) {
		this.userrepo=userrepo;
		this.passwordEncoder=passwordEncoder;
	}
	
	@Override
	public void saveUser(UserDto userdto) {
		 AppUser user=new AppUser();
		 user.setEmail(userdto.getEmail());
		 user.setFirstname(userdto.getFirstname());
		 user.setLastname(userdto.getLastname());
		 user.setPassword(passwordEncoder.encode(userdto.getPassword()));
		 user.setRole("ROLE_USER");
		 userrepo.save(user);
	}
	
	@Override
	public AppUser findByEmail(String email) {
		return userrepo.findByEmail(email);
	}

}
