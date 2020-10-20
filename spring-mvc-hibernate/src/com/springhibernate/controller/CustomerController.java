package com.springhibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springhibernate.entity.Customer;
import com.springhibernate.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	@GetMapping("/list")
	public String listCustomers(Model theModel) {
		List<Customer> theCustomers  = customerService.getCustomers();
		theModel.addAttribute("customers", theCustomers);
		return "list-customers";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		Customer theCustomer = new Customer();
		
		theModel.addAttribute(theCustomer);
		
		return "customer-form";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
		
		customerService.saveCustomer(theCustomer);
		
		return "redirect:/customer/list";
	}
	@GetMapping("/showForforUpdate")
	public String formUpdate(@RequestParam("customerId") int id, Model theModel) {
		Customer custom = customerService.getCustomerById(id);
		theModel.addAttribute(custom);
		return "customer-form";		
	}
	@GetMapping("/delete")
	private String delete(@RequestParam("customerId") int id) {
		customerService.delete(id);
		return "redirect:/customer/list";
	}
}















