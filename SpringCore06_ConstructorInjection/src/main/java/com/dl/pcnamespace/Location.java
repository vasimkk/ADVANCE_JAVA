package com.dl.pcnamespace;

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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	
}