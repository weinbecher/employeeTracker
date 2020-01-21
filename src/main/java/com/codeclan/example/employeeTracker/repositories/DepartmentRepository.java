package com.codeclan.example.employeeTracker.repositories;

import com.codeclan.example.employeeTracker.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
