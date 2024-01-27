package com.example.StudentManagementAPI.Controller;

import com.example.StudentManagementAPI.Controller.Request.StudentRequest;
import com.example.StudentManagementAPI.Controller.Response.StudentResponse;
import com.example.StudentManagementAPI.Model.Student;
import com.example.StudentManagementAPI.Service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class StudentController {

    private StudentService studentService;

    @PostMapping("/students")
    public Student addStudent(@RequestBody StudentRequest studentRequest){

        return studentService.addStudent(studentRequest);
    }

    @GetMapping("/students/{id}")
    public StudentResponse viewStudent(@PathVariable Long id){

        return studentService.viewStudent(id);

    }

    @GetMapping("/students")
    public List<StudentResponse> allStudent(){

        return studentService.allStudent();
    }
}
