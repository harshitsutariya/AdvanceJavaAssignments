package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "employeemanytomany")
public class Employee {

    @Id
    private int id;
    private String name;
    private String designation;
    private double salary;

//    @ManyToMany(cascade = CascadeType.ALL)
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "employees")
    @JsonManagedReference
    private List<Projects> projects;

    public Employee(int id, String name, String designation, double salary, List<Projects> projects) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.projects = projects;
    }

    public Employee() {
    }

    public List<Projects> getProjects() {
        return projects;
    }

    public void setProjects(List<Projects> projects) {
        this.projects = projects;
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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

