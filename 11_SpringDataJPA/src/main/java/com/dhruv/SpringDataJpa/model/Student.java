package com.dhruv.SpringDataJpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Entity
@Getter
@Setter
@ToString
public class Student {
    @Id
    private int rollno;
    private String name;
    private int marks;
}
