package com.spring.webapp.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;

import lombok.Data;
@Data
@Entity
public class Employee {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String addr;
	private long mobno;
	private String username;
	private String password;
	
}
