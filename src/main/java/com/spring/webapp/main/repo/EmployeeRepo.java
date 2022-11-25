package com.spring.webapp.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.webapp.main.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
