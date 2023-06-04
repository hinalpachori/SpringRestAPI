package com.springRestapiJPA.SpringJPARestAPI.Services;

import com.springRestapiJPA.SpringJPARestAPI.entities.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    public List<Employee> employee();
    public Optional<Employee> getEmployeeById(long employeeId);

    public Employee addEmployee(Employee employee);

    public Employee updateEmployee(Employee employee);

    public void deleteEmployeeById(long employeeId);

}
