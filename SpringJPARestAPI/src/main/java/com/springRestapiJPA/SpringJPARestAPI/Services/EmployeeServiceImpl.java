package com.springRestapiJPA.SpringJPARestAPI.Services;

import com.springRestapiJPA.SpringJPARestAPI.Repository.EmployeeDAO;
import com.springRestapiJPA.SpringJPARestAPI.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDAO employeeDAO;
    public EmployeeServiceImpl() {
    }

    @Override
    public List<Employee> employee() {
        return employeeDAO.findAll();
    }

    @Override
    public Optional<Employee> getEmployeeById(long employeeId) {
        return employeeDAO.findById(employeeId);
    }

    @Override
    public Employee addEmployee(Employee employee) {
        employeeDAO.save(employee);
        return employee;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        employeeDAO.save(employee);
        return employee;
    }

    @Override
    public void deleteEmployeeById(long employeeId) {
            Employee entity = employeeDAO.getById(employeeId);
            employeeDAO.delete(entity);
    }
}
