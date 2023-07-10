package com.example.examspring.service;

import com.example.examspring.dto.EmployeeDto;
import com.example.examspring.dto.PageDto;

import java.util.List;

public interface EmployeeService {
    List<EmployeeDto> gets(EmployeeDto criteria);
    EmployeeDto save(EmployeeDto employeeDto);

    List<EmployeeDto> findEmployeesByName(String employeeName);
}
