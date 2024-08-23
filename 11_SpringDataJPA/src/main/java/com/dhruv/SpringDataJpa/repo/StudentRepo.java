package com.dhruv.SpringDataJpa.repo;

import com.dhruv.SpringDataJpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

    List<Student> findByMarks(int marks);
    List<Student> findByMarksGreaterThan(int marks);

}
