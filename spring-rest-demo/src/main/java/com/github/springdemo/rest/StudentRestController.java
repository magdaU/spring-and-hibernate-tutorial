package com.github.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	//define endpoint for "/students"  - return list of students
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		
		List<Student> theStudent = new ArrayList<>();
		theStudent.add(new Student("Jessica", "Bom"));
		theStudent.add(new Student("Mario", "Kowalski"));
		theStudent.add(new Student("Janusz", "Erudyta"));
		return theStudent;
	}
	

}
