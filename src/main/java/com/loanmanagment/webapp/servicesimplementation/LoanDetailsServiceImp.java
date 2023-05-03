package com.loanmanagment.webapp.servicesimplementation;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loanmanagment.webapp.dto.LoanDetailsDto;
import com.loanmanagment.webapp.entities.LoanDetails;
import com.loanmanagment.webapp.repositories.LoanDetailsRepository;
import com.loanmanagment.webapp.services.LoanDetailsService;

@Service
public class LoanDetailsServiceImp implements LoanDetailsService {
	
	private LoanDetailsRepository loanrepo;

	@Autowired
	public void setLoanrepo(LoanDetailsRepository loanrepo) {
		this.loanrepo = loanrepo;
	}
	
	@Override
	public List<LoanDetailsDto> findAllLoanDetails(){
		List<LoanDetails> loans=loanrepo.findAll();
		return loans.stream().map((loan)->mapEntityToDto(loan)).collect(Collectors.toList());
	}
	
	private LoanDetailsDto mapEntityToDto(LoanDetails loan) {
		LoanDetailsDto loandto=new LoanDetailsDto();
		loandto.setAadhardata(loan.getAadhardata());
		loandto.setAltphone(loan.getAltphone());
		loandto.setCompany(loan.getCompany());
		loandto.setCredscore(loan.getCredscore());
		loandto.setDesignation(loan.getDesignation());
		loandto.setDistrict(loan.getDistrict());
		loandto.setEmail(loan.getEmail());
		loandto.setFirstname(loan.getFirstname());
		loandto.setLastname(loan.getLastname());
		loandto.setMiddlename(loan.getMiddlename());
		loandto.setImage(loan.getImage());
		loandto.setIncomedata(loan.getIncomedata());
		loandto.setPancarddata(loan.getPancarddata());
		loandto.setPhone(loan.getPhone());
		loandto.setPincode(loan.getPincode());
		loandto.setSalaryperannum(loan.getSalaryperannum());
		loandto.setState(loan.getState());
		loandto.setUsername(loan.getUsername());
		return loandto;
	}
	
	private LoanDetails mapDtoToEntity(LoanDetailsDto loandto) {
		LoanDetails loan=new LoanDetails();
		loan.setAadhardata(loandto.getAadhardata());
		loan.setAltphone(loandto.getAltphone());
		loan.setCompany(loandto.getCompany());
		loan.setCredscore(loandto.getCredscore());
		loan.setDesignation(loandto.getDesignation());
		loan.setDistrict(loandto.getDistrict());
		loan.setEmail(loandto.getEmail());
		loan.setFirstname(loandto.getFirstname());
		loan.setLastname(loandto.getLastname());
		loan.setMiddlename(loandto.getMiddlename());
		loan.setImage(loandto.getImage());
		loan.setIncomedata(loandto.getIncomedata());
		loan.setPancarddata(loandto.getPancarddata());
		loan.setPhone(loandto.getPhone());
		loan.setPincode(loandto.getPincode());
		loan.setSalaryperannum(loandto.getSalaryperannum());
		loan.setState(loandto.getState());
		loan.setUsername(loandto.getUsername());
		return loan;
	}

	@Override
	public LoanDetails saveLoanDetails(LoanDetailsDto loandto) {
		LoanDetails loan=mapDtoToEntity(loandto);
		return loanrepo.save(loan);
	}
}
