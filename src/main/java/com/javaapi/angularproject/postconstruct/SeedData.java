package com.javaapi.angularproject.postconstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.javaapi.angularproject.model.Employee;
import com.javaapi.angularproject.service.EmployeeService;

import jakarta.annotation.PostConstruct;

@Component
public class SeedData {
    @Autowired
	private EmployeeService employeeService;

    @PostConstruct
    public void init(){
        // Initialize User
		Employee user = new Employee(1l,"user1", "user1@email.com", "Manager");
		Employee user2 = new Employee(2l, "user2", "user2@email.com", "Executive");
		employeeService.saveEmployee(user);
		employeeService.saveEmployee(user2);
    }
}
