package com.github.springboot.thymleafdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.springboot.thymleafdemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	//that's it... no need to write any code LOL!
}
