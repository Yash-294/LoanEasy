package com.loanmanagment.webapp.repositories;

import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.loanmanagment.webapp.entities.LoanDetails;

public interface LoanDetailsRepository extends MongoRepository<LoanDetails,String>{
	Optional<LoanDetails>findById(String username);
}
