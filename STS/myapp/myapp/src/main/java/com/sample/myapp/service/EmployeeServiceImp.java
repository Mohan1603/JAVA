package com.sample.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.myapp.dao.EmployeeDAO;
import com.sample.myapp.entity.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService {
	
	@Autowired
	EmployeeDAO dao;
	
	public Employee saveEmployee(Employee e1) {
		
		Employee data1=dao.save(e1);
		return data1;
	}
	
	@Override
	public List<Employee> findAll() {
		
		return dao.findAll();
	}

}
