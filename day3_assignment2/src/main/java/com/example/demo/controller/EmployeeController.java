package com.example.demo.controller;

import com.example.demo.employeeDTO.DTOconverter;
import com.example.demo.employeeDTO.EmployeeDTO;
import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DTOconverter dtOconverter;

    @GetMapping("/employees")
    public List<EmployeeDTO> getAllEmployee(){
        List<Employee> list= this.employeeService.getAllEmp();

        return dtOconverter.returnDTO(list);
    }

    @GetMapping("/employees/{id}")
    public EmployeeDTO getEmployeeById(@PathVariable("id") int id) {
        Employee employee= this.employeeService.getEmpById(id);

        return dtOconverter.entityToDTO(employee);
    }

    @PostMapping("/employees")
    public void addEmployee(@RequestBody Employee employee){
        this.employeeService.addEmp(employee);
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable("id") int id){
        this.employeeService.deleteEmp(id);
    }

    @PutMapping("/employees/{id}")
    public void updateEmployee(@RequestBody Employee employee, @PathVariable("id") int id){
        this.employeeService.updateEmp(employee, id);
    }
}
