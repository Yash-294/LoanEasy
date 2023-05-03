package com.loanmanagment.webapp.services;

import com.loanmanagment.webapp.dto.UserDto;
import com.loanmanagment.webapp.entities.AppUser;

public interface UserService {
	void saveUser(UserDto userdto);
	AppUser findByEmail(String email);
}
