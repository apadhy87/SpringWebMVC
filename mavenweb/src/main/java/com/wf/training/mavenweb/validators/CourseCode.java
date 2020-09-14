package com.wf.training.mavenweb.validators;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourceCodeConstraintValidator.class)
@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)  //runtime/compile time
public @interface CourseCode{ 
	
	//Values assigned to attributeswill be returnedvy these methods
	public String prefix();
	 public String code();
	 public String message();
	 
	 //two mandatory attributes:
	 
	 //groups: use to chain multiple constraints
	 public Class<?>[] groups() default {};
	 
	 //Payloads(): Additional info about validation(e.g Sebv level, error code)
	 public Class<? extends Payload>[] payload() default {};
	 
 
}
