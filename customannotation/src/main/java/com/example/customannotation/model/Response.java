package com.example.customannotation.model;

import com.dynamicdatasource.demo.model.College;
import com.dynamicdatasource.demo.model.Student;
import lombok.Data;

import java.util.List;

@Data
public class Response {

    List<Student> students;
    List<College> colleges;
}
