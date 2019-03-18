package com.github.magdau.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.github.magdau.hibernate.demo.entity.Course;
import com.github.magdau.hibernate.demo.entity.Instructor;
import com.github.magdau.hibernate.demo.entity.InstructorDetail;

public class EagerLazyDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Course.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
					
			// start a transaction
			session.beginTransaction();
			
			// get the instructor from db
			int theId=1;
			Instructor tempInstructor = session.get(Instructor.class, theId);
			
			System.out.println("luv2code: Instructor" + tempInstructor);
			
			// commit transaction
			session.getTransaction().commit();
		
			session.close();
					
			//since courses are lazy loaded ..this should fail
			
			//tempInstructor.getCourses - this is lazy data to load
			System.out.println("luv2code: Courses" + tempInstructor.getCourses());
			
			System.out.println("luv2code : Done!");
		}
		finally {
			
			//Add clean up code
			session.close();
			
			
			factory.close();
		}
	}

}





