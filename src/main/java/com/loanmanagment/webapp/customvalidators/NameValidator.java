package com.loanmanagment.webapp.customvalidators;

import com.loanmanagment.webapp.customannotations.NameValidation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NameValidator implements ConstraintValidator<NameValidation,String> {
	@Override
	public boolean isValid(String name,ConstraintValidatorContext context) {
		if(name=="")return false;
		return name.matches("^\\p{L}+[\\p{L}\\p{P}]{0,}");
	}

}
