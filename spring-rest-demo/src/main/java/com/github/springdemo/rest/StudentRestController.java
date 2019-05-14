package com.github.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	private List<Student> theStudents;

	// define @PostConstruct to load the student data...only once!
	@PostConstruct
	public void loadData() {

		theStudents = new ArrayList<>();
		theStudents.add(new Student("Jessica", "Bom"));
		theStudents.add(new Student("Mario", "Kowalski"));
		theStudents.add(new Student("Janusz", "Erudyta"));
	}

	// define endpoint for "/students" - return list of students

	@GetMapping("/students")
	public List<Student> getStudents() {

		return theStudents;
	}

}
