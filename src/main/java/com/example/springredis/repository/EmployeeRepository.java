package com.example.springredis.repository;

import com.example.springredis.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, String> {

    Employee findEmployeeByKey(String key);

}
