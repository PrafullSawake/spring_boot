package com.spring.webapp.main.service;


import java.util.List;

import com.spring.webapp.main.comp.Emp;
import com.spring.webapp.main.model.Employee;


public interface EmpService {
	boolean saveData(Employee e);
	List<Employee> getAllEmployee();
	void deleteData(Integer id);
	Employee findById(Integer id);

}
