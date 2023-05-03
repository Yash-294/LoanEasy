package com.loanmanagment.webapp.customannotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.ReportAsSingleViolation;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

@Documented
@Constraint(validatedBy={})
@ReportAsSingleViolation
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@NotEmpty
@Pattern(regexp="^[0-9]")
public @interface NumberValidation {
	public String message() default "Please enter a valid Number";
	public Class<?>[] groups() default {};
	public Class<?extends Payload>[] payload() default {};
}
