package com.example.customannotation.controller;

import com.dynamicdatasource.demo.model.Response;


import com.example.customannotation.service.ATestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAnnController {

    @Autowired
    private ATestService testService;

    @GetMapping(value = "/")
    public Response getResponse(){
        Response response = new Response();
        response.setStudents(testService.getAllStudents());
        response.setColleges(testService.getAllColleges());
        return response;
    }
}
