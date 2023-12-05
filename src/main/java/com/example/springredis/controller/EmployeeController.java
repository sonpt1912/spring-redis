package com.example.springredis.controller;

import com.example.springredis.entity.Employee;
import com.example.springredis.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class EmployeeController {


    @Autowired
    private EmployeeService service;

    @RequestMapping("/create")
    public Object create(@RequestBody Employee employee) {
        return service.create(employee);
    }

    @PostMapping("/get-by-id")
    public Employee getOneById(@RequestBody String key) {
        return service.findByKey(key);
    }

}
