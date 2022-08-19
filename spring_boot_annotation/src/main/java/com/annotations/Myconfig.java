package com.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration //this is a configuration class and it will return bean
//config class are class which has methods which will be returning Spring beans the spring beans
//object that is returning wil be managed by spring container
@ComponentScan(basePackages = {"myPack"})
//if we want to use a class from another package to current package
public class Myconfig {
	
	@Bean("Student1")//used under config class which returns beans handle by spring container
	public Student getStudent() {
		System.out.println("Creating First Student");
		return new Student("Student1");
	}
	
	@Bean("Student2")
	@Lazy
	//it basically means it will not release the object of method which is not in use
	public Student createStudent() {
		System.out.println("Creating Second student");
		return new Student("Student2");
	}


}
