package com.employeeApp.service;

import com.employeeApp.dao.EmpDAO;
import com.employeeApp.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    private EmpDAO empDAO;
    @Autowired
    public EmpServiceImpl(EmpDAO empDAO) {
        this.empDAO = empDAO;
    }
    @Override
    @Transactional
    public List<Employee> getAllEmp() {
        return empDAO.getAllEmp();
    }

    @Override
    @Transactional
    public void saveEmp(Employee employee) {
        empDAO.saveEmp(employee);
    }

    @Override
    @Transactional
    public Employee getEmp(int id) {
        return empDAO.getEmp(id);
    }

    @Override
    @Transactional
    public void deleteEmp(int id) {
        empDAO.deleteEmp(id);
    }

}
