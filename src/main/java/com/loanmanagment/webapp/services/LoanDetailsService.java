package com.loanmanagment.webapp.services;

import java.util.List;

import com.loanmanagment.webapp.dto.LoanDetailsDto;
import com.loanmanagment.webapp.entities.LoanDetails;

public interface LoanDetailsService {
	List<LoanDetailsDto> findAllLoanDetails();
	LoanDetails saveLoanDetails(LoanDetailsDto loandto);
}
