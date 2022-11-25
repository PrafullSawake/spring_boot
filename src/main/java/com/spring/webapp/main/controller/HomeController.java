package com.spring.webapp.main.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.webapp.main.model.Employee;

import com.spring.webapp.main.service.EmpService;
@CrossOrigin
@RestController
public class HomeController {
	@Autowired
	EmpService es;
		@PostMapping("/save")
		public ResponseEntity<String> getData(@RequestBody Employee e) {
			boolean saveData = es.saveData(e);
			return new ResponseEntity<String>(HttpStatus.OK);
			
		}
		@GetMapping("/AllEmployee")
		public ResponseEntity<List<Employee>> allData(){
			List<Employee> allEmployee = es.getAllEmployee();
			return new ResponseEntity<>(allEmployee, HttpStatus.OK);			
		}
		@DeleteMapping("/deleteEmployee/{id}")
		public ResponseEntity<String> delete(@PathVariable Integer id)
		{
			es.deleteData(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		@GetMapping("/getById/{id}")
		public ResponseEntity<Employee> findOne(@PathVariable Integer id){
			Employee findById = es.findById(id);
			return new ResponseEntity<>(findById, HttpStatus.OK);
		}
}









