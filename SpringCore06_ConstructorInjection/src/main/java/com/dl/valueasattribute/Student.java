package com.dl.valueasattribute;

public class Student {

	private int rollno;
	private String batch;
	private String university;
	
	public Student() {
		
	}

	public Student(int rollno, String batch, String university) {
		this.rollno = rollno;
		this.batch = batch;
		this.university = university;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", batch=" + batch + ", university=" + university + "]";
	}
	
}
