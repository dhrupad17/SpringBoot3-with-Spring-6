package com.telusko.__SpringJDBC.service;

import com.telusko.__SpringJDBC.model.Student;
import com.telusko.__SpringJDBC.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo repo;


    public void addStudent(Student s){
        repo.save(s);
    }
    public List<Student> getStudents(){
        return repo.findAll();
    }
}
