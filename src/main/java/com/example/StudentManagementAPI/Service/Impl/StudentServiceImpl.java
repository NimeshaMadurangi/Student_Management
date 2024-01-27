package com.example.StudentManagementAPI.Service.Impl;

import com.example.StudentManagementAPI.Controller.Request.StudentRequest;
import com.example.StudentManagementAPI.Controller.Response.StudentResponse;
import com.example.StudentManagementAPI.Model.Student;
import com.example.StudentManagementAPI.Repository.StudentRepo;
import com.example.StudentManagementAPI.Service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepo repo;
    @Override
    public Student addStudent(StudentRequest request) {

        Student student = new Student();

        student.setId(request.getId());
        student.setName(request.getName());
        student.setAge(request.getAge());
        student.setAddress(request.getAddress());

        repo.save(student);

        return null;

    }

    @Override
    public StudentResponse viewStudent(Long id) {

        Optional<Student> studentOptional = repo.findById(id);

        if (studentOptional.isPresent()){

            Student student = studentOptional.get();

            return new StudentResponse(student.getId(),student.getName(),student.getAge(),student.getAddress());
        }
        return null;
    }

    @Override
    public List<StudentResponse> allStudent() {

        List<Student> studentList = repo.findAll();

        List<StudentResponse> studentResponseList = new ArrayList<>();

        for (Student student:studentList){

            StudentResponse studentResponse = StudentResponse.builder()
                    .id(student.getId())
                    .name(student.getName())
                    .age(student.getAge())
                    .address(student.getAddress())
                    .build();
            studentResponseList.add(studentResponse);

        }

        return studentResponseList;
    }

}
