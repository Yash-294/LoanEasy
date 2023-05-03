package com.loanmanagment.webapp.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.loanmanagment.webapp.entities.AppUser;

public interface UserRepository extends MongoRepository<AppUser,String> {
	AppUser findByEmail(String email);
	AppUser findFirstByEmail(String email);
}
