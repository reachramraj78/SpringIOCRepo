package com.vidvaan.student.bean;

//Student is dependent
public class Student {

	//dependency
	private int sid;
	private String name;
	
	
 
	public void setSid(int sid) {
		System.out.println("sid setter method");
		this.sid = sid;
	}



	public void setName(String name) {
		System.out.println("name setter method");
		this.name = name;
	}



	public void display() {
		System.out.println("StudentId: " + sid + " StudentName: " + name);
	}

}
