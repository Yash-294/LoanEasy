package com.loanmanagment.webapp.customannotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.ReportAsSingleViolation;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

@NotEmpty	
@Pattern(regexp="^\\p{L}+[\\p{L}\\p{P}]{0,}")// -----> "^\\p{L}+[\\p{L}\\p{Z}\\p{P}]{0,}" this regular expression is used to allow names from all languages like Müller. This name contains a 'ü' which is not a alphabet in English but is a alphabet in Turkish
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy= {})
@Documented
@ReportAsSingleViolation
public @interface NameValidation {
	public String message() default "Please Enter A Valid Name";
	public Class<?>[] groups() default {};
	public Class<?extends Payload>[] payload() default {};

}
