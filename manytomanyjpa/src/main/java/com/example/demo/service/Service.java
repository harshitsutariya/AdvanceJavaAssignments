package com.example.demo.service;

import com.example.demo.model.Student;

import java.util.List;

public interface Service {

    public void addStudent();

    public List<Student> findall();

    public List<Student> findJavaStudent();
}
