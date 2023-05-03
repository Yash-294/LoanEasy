package com.loanmanagment.webapp.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;


public class LoanDetailsDto {
	
	private String username;
	@NotEmpty(message="Please Enter your  Email")
	private String email;
	@Pattern(regexp="^\\p{L}+[\\p{L}\\p{Z}\\p{P}]{0,}",message="Please Enter a valid First Name")
	private String firstname;
	@Pattern(regexp="^\\p{L}+[\\p{L}\\p{Z}\\p{P}]{0,}",message="Please Enter a valid Last Name")
	private String lastname;
	@Pattern(regexp="^\\p{L}+[\\p{L}\\p{Z}\\p{P}]{0,}",message="Please Enter a valid Middle Name")
	private String middlename;
	@NotEmpty(message="Please Enter your Address as Given on Aadhar Card")
	private String address;
	@NotEmpty(message="Please Choose State where you live")
	private String state;
	@Pattern(regexp="^\\p{L}+[\\p{L}\\p{Z}\\p{P}]{0,}",message="Please Enter a valid District Name")
	private String district;
	@Pattern(regexp="^[0-9]",message="Please Enter a valid Aadhar Number")
	private String aadharno;
	@NotEmpty(message="Please Add your Photo")
	private String image;
	@NotEmpty(message="Please Add your Aadhar Card")
	private String aadhardata;
	@NotEmpty(message="Please Add your Pancard")
	private String pancarddata;
	@NotEmpty(message="Please Add your Income Proof")
	private String incomedata;	
	@Pattern(regexp="^[0-9]",message="Please Enter a valid Pincode")
	private String pincode;	
	@Pattern(regexp="^[0-9]",message="Please Enter a valid Phone Number")
	private String phone;
	@Pattern(regexp="^[0-9]",message="Please Enter a valid Phone Number")
	private String altphone;
	@NotEmpty(message="Please Enter Company Name where you work")
	private String company;
	@Pattern(regexp="^[0-9]",message="Please Enter a valid Number")
	private String salaryperannum;
	@NotEmpty(message="Please Enter your Designation")
	private String designation;
	@Pattern(regexp="^[0-9]",message="Please Enter a valid Number")
	private String credscore;

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAadharno() {
		return aadharno;
	}
	public void setAadharno(String aadharno) {
		this.aadharno = aadharno;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
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
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getAadhardata() {
		return aadhardata;
	}
	public void setAadhardata(String aadhardata) {
		this.aadhardata = aadhardata;
	}
	public String getPancarddata() {
		return pancarddata;
	}
	public void setPancarddata(String pancarddata) {
		this.pancarddata = pancarddata;
	}
	public String getIncomedata() {
		return incomedata;
	}
	public void setIncomedata(String incomedata) {
		this.incomedata = incomedata;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAltphone() {
		return altphone;
	}
	public void setAltphone(String altphone) {
		this.altphone = altphone;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getSalaryperannum() {
		return salaryperannum;
	}
	public void setSalaryperannum(String salaryperannum) {
		this.salaryperannum = salaryperannum;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getCredscore() {
		return credscore;
	}
	public void setCredscore(String credscore) {
		this.credscore = credscore;
	}
}
