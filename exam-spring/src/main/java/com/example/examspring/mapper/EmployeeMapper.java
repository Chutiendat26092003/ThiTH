package com.example.examspring.mapper;

import com.example.examspring.dto.EmployeeDto;
import com.example.examspring.entity.Employee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    Employee dtoToEntity(EmployeeDto employeeDto);
    EmployeeDto entityToDto(Employee employee);
}
