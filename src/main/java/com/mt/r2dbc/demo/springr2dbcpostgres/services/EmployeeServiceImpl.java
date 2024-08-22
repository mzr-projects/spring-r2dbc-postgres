package com.mt.r2dbc.demo.springr2dbcpostgres.services;

import com.mt.r2dbc.demo.springr2dbcpostgres.entities.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.data.r2dbc.core.R2dbcEntityTemplate;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.springframework.data.relational.core.query.Criteria.where;
import static org.springframework.data.relational.core.query.Query.query;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final R2dbcEntityTemplate r2dbcEntityTemplate;

    @Override
    public Flux<Employee> getAllEmployees() {
        return r2dbcEntityTemplate.select(Employee.class).all();
    }

    @Override
    public Mono<Employee> getEmployeeById(Long id) {
        return r2dbcEntityTemplate
                .select(query(where("id").is(id)), Employee.class)
                .single();
    }
}
