package com.mt.r2dbc.demo.springr2dbcpostgres.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("employee")
@Data
public class Employee {

    @Id
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private Integer age;
}
