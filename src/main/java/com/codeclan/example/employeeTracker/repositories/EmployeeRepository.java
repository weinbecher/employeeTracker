package com.codeclan.example.employeeTracker.repositories;

import com.codeclan.example.employeeTracker.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
