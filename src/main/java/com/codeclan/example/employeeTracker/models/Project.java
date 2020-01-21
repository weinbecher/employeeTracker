package com.codeclan.example.employeeTracker.models;

import java.util.ArrayList;
import java.util.List;

public class Project {
    private String name;
    private int duration;
    private List<Employee> employees;

    public Project() {
    }

    public Project(String name, int duration) {
        this.name = name;
        this.duration = duration;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
