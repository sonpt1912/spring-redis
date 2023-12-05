package com.example.springredis.service;


import com.example.springredis.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAll();

    public Employee findByKey(String key);

    public Object create(Employee employee);
}
