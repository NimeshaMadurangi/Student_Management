package com.example.StudentManagementAPI.Controller.Request;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequest {
    private Long id;
    private String name;
    private int age;
    private String address;
}
