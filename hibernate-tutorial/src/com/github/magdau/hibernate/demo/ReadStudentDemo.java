package com.github.magdau.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.github.magdau.hibernate.demo.entity.Student;

public class ReadStudentDemo {

		public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
			
		// create session
		Session session = factory.getCurrentSession();
			
		try {			
				// create a student object
				System.out.println("Creating new student object...");
				Student tempStudent = new Student("Daffy", "Duck", "daffy@luv2code.com");
				
				// start a transaction
				session.beginTransaction();
				
				// save the student object
				System.out.println("Saving the student...");
				System.out.println(tempStudent);
				session.save(tempStudent);
				
				// commit transaction
				session.getTransaction().commit();
				
				//My new code
				
				//Find out the student;s id: primiary key
				System.out.println("Saved student.Generated id " + tempStudent.getId());
				
				//Now get a new session transaction
				session = factory.getCurrentSession();
				session.beginTransaction();
				
				//Retrieve student based on the id: primary id
				System.out.println("\nGetting student with id" + tempStudent.getId());
				
				Student myStudent = session.get(Student.class, tempStudent.getId());
				
				//Commit the transacion
				session.getTransaction().commit();
				
				System.out.println("Done!");
			}
			finally {
				factory.close();
			}
		}
}

