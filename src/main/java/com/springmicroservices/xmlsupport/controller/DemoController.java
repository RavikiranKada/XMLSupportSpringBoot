package com.springmicroservices.xmlsupport.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmicroservices.xmlsupport.domain.Employee;

@RestController
public class DemoController {

	@GetMapping("/employees")
	public Employee getHello() {
		
		return new Employee("123","Ravikiran","Pune");
	}
	
}
