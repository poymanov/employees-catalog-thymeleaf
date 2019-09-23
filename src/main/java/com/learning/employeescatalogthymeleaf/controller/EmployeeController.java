package com.learning.employeescatalogthymeleaf.controller;

import com.learning.employeescatalogthymeleaf.entity.Employee;
import com.learning.employeescatalogthymeleaf.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/employees")
@Controller
public class EmployeeController {
    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("employees", employeeService.findAll());
        return "employees/index";
    }

    @GetMapping("/new")
    public String newEmployee(Model model) {
        model.addAttribute("employee", new Employee());
        return "employees/form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Employee employee) {
        employeeService.save(employee);
        return "redirect:/employees/index";
    }

    @GetMapping("/edit")
    public String edit(Model model, @RequestParam int id) {
        model.addAttribute("employee", employeeService.findById(id));
        return "employees/form";
    }
}
