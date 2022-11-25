package com.spring.webapp.main.serviceimpl;

import java.util.List;
import java.util.Optional;

import javax.management.loading.PrivateClassLoader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.webapp.main.model.Employee;
import com.spring.webapp.main.repo.EmployeeRepo;
import com.spring.webapp.main.service.EmpService;
@Service
public class HomeService implements EmpService {
	@Autowired
	EmployeeRepo er;
	@Override
	public boolean saveData(Employee e) {
		Employee save = er.save(e);
		if(save==null)
		return false;
		else
			return true;
	}
	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> all = er.findAll();
		return all;
	}
	@Override
	public void deleteData(Integer id) {
		er.deleteById(id);
	
	}
	@Override
	public Employee findById(Integer id) {
		Optional<Employee> findById = er.findById(id);
		if(findById.isEmpty()) {
			return null;
		} else {
			Employee employee = findById.get();
			return employee;
		}		
	}

}
