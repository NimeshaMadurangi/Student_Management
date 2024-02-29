package com.example.StudentManagementAPI.Service;

import com.example.StudentManagementAPI.Controller.Request.StudentRequest;
import com.example.StudentManagementAPI.Controller.Response.StudentResponse;
import com.example.StudentManagementAPI.Model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    Student addStudent(StudentRequest request);

    StudentResponse viewStudent(Long id);

    List<StudentResponse> allStudent();

    void deleteStudent(Long id);

    StudentRequest updateStudent(StudentRequest request, Long id);
}
