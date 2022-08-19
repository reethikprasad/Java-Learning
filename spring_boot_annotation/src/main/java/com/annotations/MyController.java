package com.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	@Autowired
	@Qualifier("Student1")
	private Student student;
	
	@RequestMapping(value ="/home",method = RequestMethod.GET)
	//used to map value to method
	@ResponseBody
	//The @ResponseBody annotation tells a controller that the object returned is 
	//tomatically serialized into JSON and passed back into the HttpResponse object
	public Student home() {
		System.out.println("This is home method");
		this.student.setName("Reethik PrasaD");
		return this.student;
		
	}

}
