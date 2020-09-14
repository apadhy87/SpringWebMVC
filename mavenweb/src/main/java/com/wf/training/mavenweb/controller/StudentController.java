package com.wf.training.mavenweb.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wf.training.mavenweb.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/home")
	public String home() {
		return "student-home";
	}
	
	@RequestMapping("/profile")
	public String profile(Model model) {
		Student student = new Student();  // empty bag
		// student.setName("Dummy");
		model.addAttribute("student", student);
		return "student-profile";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProfile(@Valid @ModelAttribute Student student, BindingResult  result)
		 {
		if(result.hasErrors())
		{
			return "student-profile";
		}
		
		return "student-confirm";
	}
	
	//interceptor  - Filter the incoming data
	
	@InitBinder
	public void intBinder(WebDataBinder binder)
	{
		StringTrimmerEditor trimmer=new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, trimmer);
	}
	
}

















