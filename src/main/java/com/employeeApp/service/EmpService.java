package com.employeeApp.service;

import com.employeeApp.entity.Employee;

import java.util.List;

public interface EmpService {
    public List<Employee> getAllEmp();
    public void saveEmp(Employee employee);

    public Employee getEmp(int id);
    public void deleteEmp(int id);
}
