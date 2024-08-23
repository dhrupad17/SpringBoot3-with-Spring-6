package com.dhruv.SpringDataJpa;

import com.dhruv.SpringDataJpa.model.Student;
import com.dhruv.SpringDataJpa.repo.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Application.class, args);
		Student s1=context.getBean(Student.class);
		Student s2=context.getBean(Student.class);
		Student s3=context.getBean(Student.class);

		StudentRepo repo=context.getBean(StudentRepo.class);

		//Insertion

//		s1.setRollno(101);
//		s1.setName("Dhruv");
//		s1.setMarks(89);
//
//		s2.setRollno(114);
//		s2.setName("Dhrupad");
//		s2.setMarks(89);
//
//		s3.setRollno(103);
//		s3.setName("Mithila");
//		s3.setMarks(94);

		// saving the data into database

//		repo.save(s1);
//		repo.save(s2);
//		repo.save(s3);

		//Find All Records

//		System.out.println(repo.findAll());

		//Find by Primary Key

//		System.out.println(repo.findById(114));


		//Find By other columns(Custom Finder Methods)

//		System.out.println(repo.findByMarks(89));
//		System.out.println(repo.findByMarksGreaterThan(80));

		//Update and Delete

//		s2.setRollno(114);
//		s2.setName("Dhrupad");
//		s2.setMarks(99);
//
//		System.out.println(repo.save(s2));
//
//		repo.delete(s1);

		System.out.println(repo.findAll());


	}

}
