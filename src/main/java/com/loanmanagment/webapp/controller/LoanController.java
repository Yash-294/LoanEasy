package com.loanmanagment.webapp.controller;

import java.io.File;
import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.loanmanagment.webapp.dto.LoanDetailsDto;
import com.loanmanagment.webapp.entities.AppUser;
import com.loanmanagment.webapp.entities.LoanDetails;
import com.loanmanagment.webapp.repositories.UserRepository;
import com.loanmanagment.webapp.services.LoanDetailsService;

import jakarta.validation.Valid;

@Controller
public class LoanController {
	private LoanDetailsService loanserv;
	
	private UserRepository userrepo;
	
	private static int a=0;

	@Autowired
	public LoanController(LoanDetailsService loanserv,UserRepository userrepo) {
		super();
		this.loanserv = loanserv;
		this.userrepo=userrepo;
	}
	
	@GetMapping("/loans")
	public String getLoans(Model mod) { 
		List<LoanDetailsDto> loans=loanserv.findAllLoanDetails();
		mod.addAttribute("loans", loans);
		return "Loans";
	}
	
	@GetMapping("/loanform/submit")
	public String submitLoanForm(Model mod,Principal principal) {
		LoanDetailsDto loanformdto=new LoanDetailsDto();
		AppUser user=new AppUser();
		user=userrepo.findFirstByEmail(principal.getName());
		loanformdto.setFirstname(user.getFirstname());
		loanformdto.setLastname(user.getLastname());
		loanformdto.setEmail(user.getEmail());
		mod.addAttribute("loanform",loanformdto);
		return "LoanForm";
	}
	
	@GetMapping("/pdf")
	public String test(Model mod) {
		LoanDetails loanform=new LoanDetails();
		mod.addAttribute("loanform",loanform);
		return "PDF";
	}
		 
	@PostMapping("/loanform/submit")
	public String storeLoanDetails(@ModelAttribute("loanform")@Valid LoanDetailsDto loanformdto,BindingResult bindingresult,Model mod,@RequestParam("passphoto")MultipartFile imagefile,@RequestParam("aadharphoto")MultipartFile aadharfile,@RequestParam("panphoto")MultipartFile panfile,@RequestParam("incomephoto")MultipartFile incomefile) {
		if(bindingresult.hasFieldErrors("email")||bindingresult.hasFieldErrors("firstname")||bindingresult.hasFieldErrors("lastname")||bindingresult.hasFieldErrors("middlename")||bindingresult.hasFieldErrors("address")||bindingresult.hasFieldErrors("state")||bindingresult.hasFieldErrors("district")||bindingresult.hasFieldErrors("aadharno")||bindingresult.hasFieldErrors("pincode")||bindingresult.hasFieldErrors("phone")||bindingresult.hasFieldErrors("altphone")||bindingresult.hasFieldErrors("company")||bindingresult.hasFieldErrors("salaryperannum")||bindingresult.hasFieldErrors("designation")||bindingresult.hasFieldErrors("credscore")) {
			mod.addAttribute("loanform",loanformdto);
			return "LoanForm";
		}
		File directory=new File("D:/LoanManagement/webapp/src/main/resources/LoanFiles");
		if(!directory.exists()) {
			directory.mkdir();
		}
		try {
			String imageString=imagefile.getOriginalFilename();
			String aadharString=aadharfile.getOriginalFilename();
			String panString=panfile.getOriginalFilename();
			String incomeString=incomefile.getOriginalFilename();
			File uploadimage=new File(directory,imageString);
			imagefile.transferTo(uploadimage);
			File uploadaadhar=new File(directory,aadharString);
			aadharfile.transferTo(uploadaadhar);
			File uploadpan=new File(directory,panString);
			panfile.transferTo(uploadpan);
			File uploadincome=new File(directory,incomeString);
			incomefile.transferTo(uploadincome);
			++a;
			loanformdto.setAadhardata(uploadaadhar.getPath().replace("D:\\LoanManagement\\webapp\\src\\main\\resources\\LoanFiles\\","/LoanFiles/"+a));
			++a;
			loanformdto.setPancarddata(uploadpan.getPath().replace("D:\\LoanManagement\\webapp\\src\\main\\resources\\LoanFiles\\","/LoanFiles/"+a));
			++a;
			loanformdto.setIncomedata(uploadincome.getPath().replace("D:\\LoanManagement\\webapp\\src\\main\\resources\\LoanFiles\\","/LoanFiles/"+a));
			++a;
			loanformdto.setImage(uploadimage.getPath().replace("D:\\LoanManagement\\webapp\\src\\main\\resources\\LoanFiles\\","/LoanFiles/"+a));
		}
		catch(Exception e) {
			mod.addAttribute("loanform",loanformdto);
			return "LoanForm";
		}
		loanserv.saveLoanDetails(loanformdto);
		return "redirect:/dashboard";
	}
	
}
