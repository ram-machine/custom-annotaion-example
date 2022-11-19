//package com.example.customannotation.service;
//
//
//import com.dynamicdatasource.demo.config.SwitchDataSource;
//import com.example.customannotation.model.Student;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class AStudentService {
//
//    @Autowired
//    AStudentRepository studentRepository;
//
//    @SwitchDataSource(value = "student")
//    public List<Student> getAllStudents(){
//        return studentRepository.findAll();
//    }
//
//}
