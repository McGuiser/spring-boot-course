package com.corey.springboot.cruddemo.dao;

import java.util.List;

import com.corey.springboot.cruddemo.entity.Employee;

public interface EmploeeDAO {
	
	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee thEmployee);
	
	public void deleteById(int theId);
	
}
