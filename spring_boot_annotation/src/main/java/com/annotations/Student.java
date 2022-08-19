package com.annotations;

public class Student {

	
	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	String name;
	
	
	


	public Student(String name) {
		this.name = name;
	}





	void studying() {
		// TODO Auto-generated method stub
		System.out.println(this.name+ " I am studying");
	}
}
