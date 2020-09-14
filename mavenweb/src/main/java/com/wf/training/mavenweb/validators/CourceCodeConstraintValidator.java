package com.wf.training.mavenweb.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourceCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {
	private String expectedprefix;
	
	@Override
	public void initialize(CourseCode constraintAnnotation)
	{
		constraintAnnotation.prefix();
	}
	
	

	@Override
	public boolean isValid(String actualCode, ConstraintValidatorContext context) {
		
		if(actualCode.startsWith(expectedprefix))
			return true;
		
		return false;
	}

}
