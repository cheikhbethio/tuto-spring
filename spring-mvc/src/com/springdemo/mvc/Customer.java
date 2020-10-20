package com.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
	private String firstName;
	@NotNull
	@Size(min=1, message="the min size is 1")
	private String lastName;
	
	@NotNull
	@Min(value=0, message="must be betwen 0 abd 10")
	@Max(value=10, message="must be betwen 0 abd 10")
	private Integer freePasses;
	
	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "must be 5 chars/digits")
	private String postalCode;

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
}
