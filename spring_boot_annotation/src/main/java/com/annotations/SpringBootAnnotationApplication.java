package com.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import myPack.Dog;


//used for Enableautoconfiguration(no Manual configuration) +
//component scan(pass packages) + configuration
// 
@SpringBootApplication
public class SpringBootAnnotationApplication implements CommandLineRunner {

	
	@Autowired //used to inject dependency/objects can be done on object setter and constr
	@Qualifier("Student1")
	//The @Qualifier annotation is used to resolve the autowiring conflict,
	//when there are multiple beans of same type
	private Student student;
	
	@Autowired
	private Emp emp;
	
	@Autowired
	private Dog dog;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootAnnotationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.student.studying();
		this.emp.whatYourName();
		this.dog.eating();
		
	}

}
