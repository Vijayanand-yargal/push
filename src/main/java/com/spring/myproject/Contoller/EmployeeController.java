package com.spring.myproject.Contoller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.myproject.Employee.Employee;
import com.spring.myproject.Service.EmployeeService;


@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
     @Autowired
	private EmployeeService employeeService;
     
    @GetMapping
    public  ResponseEntity<List<Employee>> getAllEmployees(){
    	List<Employee> employees=employeeService.getAllEmployees();
    	return ResponseEntity.ok(employees);
    }
    
    @GetMapping("/{id}")
  public ResponseEntity<Employee> getEmployeeById(@PathVariable int id){
    	Employee employee=employeeService.getEmployeeById(id);
    	return employee!=null?ResponseEntity.ok(employee):ResponseEntity.notFound().build();
    }
    
    @PostMapping
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
    	Employee saveEmployee=employeeService.saveEmployee(employee);
    	return ResponseEntity.ok(saveEmployee);
    	}
    	
    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable int id , @RequestBody Employee employee) {
    	Employee existEmployee=employeeService.getEmployeeById(id);
    	if (existEmployee==null) {
			return ResponseEntity.notFound().build();
			
		}
    	  existEmployee.setName(employee.getName());
    	Employee updateEmployee=employeeService.saveEmployee(existEmployee);
    	return ResponseEntity.ok(updateEmployee);
    	
    	
    }
    @DeleteMapping("/{id}")
 public ResponseEntity<Employee> deteleteEmployee(@PathVariable int id)
 
 {
	 employeeService.deleteEmployeById(id);
	 return ResponseEntity.noContent().build();
	
 }
}
