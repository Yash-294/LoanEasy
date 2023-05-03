package com.loanmanagment.webapp.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.loanmanagment.webapp.entities.AppUser;
import com.loanmanagment.webapp.repositories.UserRepository;

@Service
public class UserDetailsDBService implements UserDetailsService {
	private UserRepository userrepo;
	
	@Autowired
	public UserDetailsDBService(UserRepository userrepo){
		this.userrepo=userrepo;
	}
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		AppUser user=userrepo.findFirstByEmail(email);
		if(user!=null) {
			List<GrantedAuthority> authority=new ArrayList<>();
			authority.add(new SimpleGrantedAuthority("ROLE_USER"));
			User authUser=new User(user.getEmail(),user.getPassword(),authority);
			return authUser;
		}
		else {
			throw new UsernameNotFoundException("Invalid Email/Password");
		}
		
	}

}
