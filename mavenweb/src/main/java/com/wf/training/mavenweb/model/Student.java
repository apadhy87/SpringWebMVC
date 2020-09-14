package com.wf.training.mavenweb.model;

import java.util.LinkedHashMap;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.wf.training.mavenweb.validators.CourseCode;

public class Student {
	
	//@NotBlank(message = "Name is mandatory!")
	@NotNull(message = "Name is mandatory!")
	private String name;
	
	private String email;
	
	private String country;
	
	private String favoriteLanguage;
	
	private String[] operatingSystems;
	
	@CourseCode(prefix="WF", message ="Invalid course code", code = "400")
	public String courseCode;
	
	public String getCourseCode() {
		return courseCode;
	}



	public void setCourseCode(String courceCode) {
		this.courseCode = courceCode;
	}
	private Integer freePasses;
	
	private LinkedHashMap<String, String> countries;
	
	public Student() {
		this.countries = new LinkedHashMap<String, String>();
		this.countries.put("FR", "France");
		this.countries.put("IN", "India");
		this.countries.put("GR", "Germany");
		this.countries.put("US", "USA");
	}
	
	
	
	public LinkedHashMap<String, String> getCountries() {
		return countries;
	}

	

	public Integer getFreePasses() {
		return freePasses;
	}



	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}



	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}



	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}



	public String[] getOperatingSystems() {
		return operatingSystems;
	}



	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
