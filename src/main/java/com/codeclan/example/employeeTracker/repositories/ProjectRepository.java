package com.codeclan.example.employeeTracker.repositories;

import com.codeclan.example.employeeTracker.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
