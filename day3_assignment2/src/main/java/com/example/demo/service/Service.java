package com.example.demo.service;

import com.example.demo.model.Employee;

import java.util.List;

public interface Service {

    public List<Employee> getAllEmp();

    public Employee getEmpById(int id);

    public Employee addEmp(Employee employee);

    public void deleteEmp(int id);

    public void updateEmp(Employee employee, int id);
}
