package com.example.examspring.repository;

import com.example.examspring.dto.EmployeeDto;
import com.example.examspring.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>, JpaSpecificationExecutor {
    @Query(value = "from Employee where name like %:name% ")
    List<Employee> findEmployeesByName(@Param("name") String employeeName);

}
