package com.example.StudentManagementAPI.Controller.Response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponse {

    private Long id;
    private String name;
    private int age;
    private String address;
}
