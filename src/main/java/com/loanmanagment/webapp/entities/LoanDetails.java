package com.loanmanagment.webapp.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="userloan")
public class LoanDetails {
	
	@Id
	private String username;
	private String email;
	private String firstname;
	private String lastname;
	private String middlename;
	private String address;
	private String state;
	private String district;
	private String aadharno;
	private String image;
	private String aadhardata;
	private String pancarddata;
	private String incomedata;
	private String pincode;
	private String phone;
	private String altphone;
	private String company;
	private String salaryperannum;
	private String designation;
	private String credscore;

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

}
