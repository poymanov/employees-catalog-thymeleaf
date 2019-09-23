package com.learning.employeescatalogthymeleaf.dao;

import com.learning.employeescatalogthymeleaf.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}