package com.springRestapiJPA.SpringJPARestAPI.Repository;

import com.springRestapiJPA.SpringJPARestAPI.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDAO extends JpaRepository<Employee,Long> {
}
