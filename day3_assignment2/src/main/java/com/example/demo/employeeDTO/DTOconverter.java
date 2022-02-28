package com.example.demo.employeeDTO;

import com.example.demo.model.Employee;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DTOconverter {

    public EmployeeDTO entityToDTO(Employee employee){

        EmployeeDTO dto = new EmployeeDTO();
        dto.setId(employee.getId());
        dto.setName(employee.getName());
        dto.setDesignation(employee.getDesignation());

        return dto;
    }

    public List<EmployeeDTO> returnDTO(List<Employee> employees){

        return employees.stream().map(e -> entityToDTO(e)).collect(Collectors.toList());
    }


    public Employee dtoToEntity(EmployeeDTO dto){

        Employee employee = new Employee();
        employee.setId(dto.getId());
        employee.setName(dto.getName());
        employee.setDesignation(dto.getDesignation());

        return employee;
    }

    public Employee returnEntity(List<EmployeeDTO> employeeDTOs){
        return (Employee) employeeDTOs.stream().map(e -> dtoToEntity(e)).collect(Collectors.toList());
    }

}
