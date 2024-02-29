package com.example.StudentManagementAPI.Model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.List;

@Data
@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long did;
    private String dname;

    @OneToMany (mappedBy = "id")
    private List<Student> students;

}
