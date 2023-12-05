package com.example.springredis.service.impl;

import com.example.springredis.entity.Employee;
import com.example.springredis.repository.EmployeeRepository;
import com.example.springredis.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repository;


    @Override
    public List<Employee> getAll() {
        return (List<Employee>) repository.findAll();
    }

    @Override
    public Employee findByKey(String key) {
        return repository.findEmployeeByKey(key);
    }

    @Override
    public Object create(Employee employee) {
        return repository.save(employee);
    }
}
