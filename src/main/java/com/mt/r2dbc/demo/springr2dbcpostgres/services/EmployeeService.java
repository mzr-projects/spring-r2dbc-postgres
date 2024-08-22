package com.mt.r2dbc.demo.springr2dbcpostgres.services;

import com.mt.r2dbc.demo.springr2dbcpostgres.entities.Employee;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmployeeService {

    Flux<Employee> getAllEmployees();

    Mono<Employee> getEmployeeById (Long id);
}
