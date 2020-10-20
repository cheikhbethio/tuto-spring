package com.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(HttpServletRequest request, Model model) {
		String name = request.getParameter("name");
		name = "yo yo" + name.toUpperCase();
		
		model.addAttribute("message", name);
		
		return "hello-member";
	}

}
