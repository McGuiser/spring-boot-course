package com.corey.springboot.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.corey.springboot.cruddemo.entity.Employee;

@Repository
public class EmployeeDAOHibernateImpl implements EmploeeDAO {
	
	// Define field for entitymanager
	
	private EntityManager entityManager;
	
	// Set up constructor injection
	
	@Autowired
	public EmployeeDAOHibernateImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Override
	@Transactional
	public List<Employee> findAll() {

		// Get the current hibernate session
		
		Session currentSession = entityManager.unwrap(Session.class);
		
		// Create a query
		
		Query<Employee> theQuery = currentSession.createQuery("from Employee", Employee.class);
		
		// Execute query and get result list
		
		List<Employee> employees = theQuery.getResultList();
		
		// return the results
		
		return employees;
	}

}