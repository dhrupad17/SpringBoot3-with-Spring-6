package com.dhruv.SpringSecurityJWT.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name="users1")
@Entity
public class User {

    @Id
    private int id;
    private String username;
    private String password;
}
