package com.sample.myapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.myapp.entity.Employee;
import com.sample.myapp.service.EmployeeService;

@RestController
public class MyController {
	
	@Autowired
	EmployeeService service;
	
	@GetMapping(value="/empdetails")
	public List<Employee> findall() {
		List<Employee> e=service.findAll();
		return e;
	}
	
	@PostMapping(value="/save")
	public Employee saveEmployee(@RequestBody Employee e1)
	{
		Employee data=service.saveEmployee(e1);
		return data;
	}



}
