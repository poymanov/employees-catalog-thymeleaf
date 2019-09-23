package com.learning.employeescatalogthymeleaf.service;

import com.learning.employeescatalogthymeleaf.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(int id);

    public void save(Employee employee);

    public void delete(int id);
}
