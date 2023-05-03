package com.loanmanagment.webapp.customvalidators;

import com.loanmanagment.webapp.customannotations.NumberValidation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NumberValidator implements ConstraintValidator<NumberValidation,String>{
	@Override
	public boolean isValid(String number,ConstraintValidatorContext context) {
		if(number=="")return false;
		return number.matches("^[0-9]");
	}
}
