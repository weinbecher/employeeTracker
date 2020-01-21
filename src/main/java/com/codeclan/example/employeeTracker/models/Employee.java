package com.codeclan.example.employeeTracker.models;

public class Employee {
    private String firstName;
    private String lastName;
    private int employeeNum;
    private Project project;
    private Department department;

    public Employee() {

    }

    public Employee(String firstName, String lastName, int employeeNum, Project project, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeNum = employeeNum;
        this.project = project;
        this.department = department;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(int employeeNum) {
        this.employeeNum = employeeNum;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
