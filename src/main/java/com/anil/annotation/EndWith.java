package com.anil.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = MailValidator.class )
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface EndWith {
	 public String value() default "@gmail.com";
	 public String message() default "your emai id must be gmail type";
	 
	 public Class<?>[] groups() default {}; 
		
		// define default payloads
		public Class<? extends Payload>[] payload() default {};
	 

}
