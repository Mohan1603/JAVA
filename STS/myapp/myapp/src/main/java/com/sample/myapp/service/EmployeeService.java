package com.sample.myapp.service;

import java.util.List;
import com.sample.myapp.entity.Employee;

public interface EmployeeService {
	

	Employee saveEmployee(Employee e);

	List<Employee> findAll();

	}
