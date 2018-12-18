package com.corey.springboot.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.corey.springboot.cruddemo.dao.EmploeeDAO;
import com.corey.springboot.cruddemo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmploeeDAO employeeDAO;
	
	@Autowired
	public EmployeeServiceImpl(EmploeeDAO thEmploeeDAO) {
		employeeDAO = thEmploeeDAO;
	}
	

	@Override
	@Transactional
	public List<Employee> findAll() {
		return employeeDAO.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int theId) {
		return employeeDAO.findById(theId);
	}

	@Override
	@Transactional
	public void save(Employee thEmployee) {
		employeeDAO.save(thEmployee);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		employeeDAO.deleteById(theId);
	}

}
