package com.anil.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MailValidator implements ConstraintValidator<EndWith,String> {

	private String mailSuffix;
	public void initialize(EndWith theEndWith) {
		// TODO Auto-generated method stub
		mailSuffix =  theEndWith.value();
		
	}

	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub 
		boolean result;
		if(value!=null && value.endsWith(mailSuffix))
		{
			return true;
		}
		return false;
	}

}
