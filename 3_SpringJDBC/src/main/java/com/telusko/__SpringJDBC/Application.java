package com.telusko.__SpringJDBC;

import com.telusko.__SpringJDBC.model.Student;
import com.telusko.__SpringJDBC.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext context= SpringApplication.run(Application.class, args);
		Student s=context.getBean(Student.class);
		s.setRollNo(114);

		s.setName("Dhrupad Chakraborty");
		s.setMarks(97);

		StudentService service=context.getBean(StudentService.class);

		service.addStudent(s);

		List<Student> students=service.getStudents();
		System.out.println(students);


	}

}

/* Spring Jdbc Using JdbcTemplate and h2 database
Output
* [Student{rollNo=101, name='Dhrupad', marks=99}, Student{rollNo=102, name='Harsh', marks=68}, Student{rollNo=103, name='Sushil', marks=82}, Student{rollNo=114, name='Dhrupad Chakraborty', marks=97}]
* */