package com.github.magdau.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.github.magdau.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

		public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
			
		// create session
		Session session = factory.getCurrentSession();
			
		try {				
				int studentId=1;

				//Now get a new session transaction
				session = factory.getCurrentSession();
				session.beginTransaction();
				
				//Retrieve student based on the id: primary id
				System.out.println("\nGetting student with id" + studentId);
				
				Student myStudent = session.get(Student.class, studentId);
				
				System.out.println("Updateing student...");
				myStudent.setFirstName("Scooby");
				
				//Commit the transacion
				session.getTransaction().commit();
				
				//New code
				session=factory.getCurrentSession();
				session.beginTransaction();
				
				//Update email for all students
				System.out.println("Update email for all studenrts");
				
				session.createQuery("update Student set email='foo@gmail.com'").executeUpdate();
			
				//Commit the transaction
				session.getTransaction().commit();
				
				System.out.println("Done!");
			}
			finally {
				factory.close();
			}
		}
}

