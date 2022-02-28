package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Projects {

    @Id
    private int id;
    public String name;

//    @ManyToMany
    @ManyToOne
    @JsonBackReference
    private Employee employees;

    public Projects(int id, String name, Employee employees) {
        this.id = id;
        this.name = name;
        this.employees = employees;
    }

    public Projects() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getEmployees() {
        return employees;
    }

    public void setEmployees(Employee employees) {
        this.employees = employees;
    }
}
