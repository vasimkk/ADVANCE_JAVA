package com.dl.valueaselement;

public class Location {

	private String city;
	private String state;
	private Student student; // Has A 
	
	public Location() {
		
	}

	public Location(String city, String state, Student student) {
		this.city = city;
		this.state = state;
		this.student = student;
	}

	@Override
	public String toString() {
		return "Location [city=" + city + ", state=" + state + ", student=" + student + "]";
	}
	
	
}
	
	
