package com.dl.pcnamespace;

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

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}
	
	
}