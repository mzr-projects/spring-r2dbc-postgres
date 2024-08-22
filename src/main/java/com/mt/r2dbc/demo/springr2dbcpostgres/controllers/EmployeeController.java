package com.mt.r2dbc.demo.springr2dbcpostgres.controllers;

import com.mt.r2dbc.demo.springr2dbcpostgres.entities.Employee;
import com.mt.r2dbc.demo.springr2dbcpostgres.services.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping(value = "/employee")
@AllArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping(value = "/all")
    public Flux<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
}
