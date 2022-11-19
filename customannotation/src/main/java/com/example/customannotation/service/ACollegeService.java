//package com.example.customannotation.service;
//
//
//import com.dynamicdatasource.demo.config.SwitchDataSource;
//import com.example.customannotation.model.College;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class ACollegeService {
//
//    @Autowired
//    private CollegeRepository collegeRepository;
//
//    @SwitchDataSource(value = "college")
//    public List<College> getAllColleges(){
//        return collegeRepository.findAll();
//    }
//}
