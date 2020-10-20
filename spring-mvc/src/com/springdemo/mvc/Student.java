package com.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> possibleReligions = new LinkedHashMap<String, String>();
	private String religion;
	private String favoriteLangage;
	private String[] passions;
	
	Student(){
		possibleReligions.put("IS", "Islam");
		possibleReligions.put("CR", "Christianisme");
		possibleReligions.put("ID", "Indouisme");
	}
	
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String contry) {
		this.country = contry;
	}

	public LinkedHashMap<String, String> getPossibleReligions() {
		return possibleReligions;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getFavoriteLangage() {
		return favoriteLangage;
	}

	public void setFavoriteLangage(String favoriteLangage) {
		this.favoriteLangage = favoriteLangage;
	}

	public String[] getPassions() {
		return passions;
	}

	public void setPassions(String[] passions) {
		this.passions = passions;
	}
	
	
	
	
}
