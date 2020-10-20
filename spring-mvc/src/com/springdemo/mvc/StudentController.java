package com.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		Student student = new Student();
		
		theModel.addAttribute("student", student);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	private String processForm(@ModelAttribute("student") Student theStudent) {

		System.out.println(theStudent.getFirstName() + "   "+ theStudent.getLastName());
		return "confirmation-form";
	}
}


/*

create student class
student controller
html  form
processing code
confirmation page

*/