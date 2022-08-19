package com.annotations;

import org.springframework.stereotype.Component;

@Component //its object will be managed by spring container
public class Emp {
	
	public void whatYourName() {
		System.out.println("I am Reethik");
	}

}
