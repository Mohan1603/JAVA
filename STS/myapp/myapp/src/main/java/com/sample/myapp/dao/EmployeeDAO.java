package com.sample.myapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sample.myapp.entity.Employee;


public interface EmployeeDAO extends JpaRepository<Employee, Integer>{

}
