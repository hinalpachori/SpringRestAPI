package com.springRestapiJPA.SpringJPARestAPI.Controller;

import com.springRestapiJPA.SpringJPARestAPI.Services.EmployeeService;
import com.springRestapiJPA.SpringJPARestAPI.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class myEmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/employees")
    public List<Employee> getEmployee()
    {
       return this.employeeService.employee();
    }
    @GetMapping("/employees/{empId}")
    public Optional<Employee> getEmployeeById(@PathVariable String empId)
    {
        return this.employeeService.getEmployeeById(Long.parseLong(empId));
    }
    @PostMapping("/addEmployee")
    public Employee aEmployee(@RequestBody Employee employee)
    {
        return employeeService.addEmployee(employee);
    }
    @PutMapping("/updateEmployee")
    public Employee uEmployee( @RequestBody Employee employee)
    {
        return this.employeeService.updateEmployee(employee);
    }
@DeleteMapping("/deleteEmployee/{Emp_id}")
@ResponseBody
    public String dEmployee(@PathVariable String Emp_id)
    {
        try {
            this.employeeService.deleteEmployeeById(Long.parseLong(Emp_id));
            return "Successfully  deleted";
        }
         catch (Exception e)
        {
//            return new ResponseEntity<>(HttpStatus.OK);
            return "Not deleted";
        }
    }
}
