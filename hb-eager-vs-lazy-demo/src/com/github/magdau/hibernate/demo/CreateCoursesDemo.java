package com.github.magdau.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.github.magdau.hibernate.demo.entity.Course;
import com.github.magdau.hibernate.demo.entity.Instructor;
import com.github.magdau.hibernate.demo.entity.InstructorDetail;

public class CreateCoursesDemo {

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
			
			//create some courses
			Course tempCourses1= new Course("Air Guitar - the Ultimate Guide");
			Course tempCourses2 = new Course("The Pinball Masterclass");
			
			//add courses to instructor
			tempInstructor.add(tempCourses1);
			tempInstructor.add(tempCourses2);
			
			session.save(tempCourses1);
			session.save(tempCourses2);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			
			//Add clean up code
			session.close();
			
			factory.close();
		}
	}

}





