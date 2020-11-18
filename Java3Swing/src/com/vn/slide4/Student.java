package com.vn.slide4;

public class Student {
	String student;
	String major;

	public Student(String student, String major) {
		super();
		this.student = student;
		this.major = major;
	}

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "Student [student=" + student + ", major=" + major + "]";
	}
	
	

}
