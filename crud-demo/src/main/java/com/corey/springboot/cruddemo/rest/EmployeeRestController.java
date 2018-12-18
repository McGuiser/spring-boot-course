package com.corey.springboot.cruddemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corey.springboot.cruddemo.dao.EmploeeDAO;
import com.corey.springboot.cruddemo.entity.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	
	private EmploeeDAO employeeDAO;

	// Quick and dirty: inject employee dao
	
	@Autowired
	public EmployeeRestController(EmploeeDAO theEmploeeDAO) {
		employeeDAO = theEmploeeDAO;
	}
	
	// Expose "/employees" and return list of employees
	
	@GetMapping("/employees")
	public List<Employee> findAll(){
		return employeeDAO.findAll();
	}
	
}
