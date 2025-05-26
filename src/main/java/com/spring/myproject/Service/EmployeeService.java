package com.spring.myproject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.myproject.Employee.Employee;
import com.spring.myproject.EmployeeRepo.EmployeeRepository;
@Service
public class EmployeeService {

	@Autowired
private EmployeeRepository employeeRepository;	
	
	public List<Employee> getAllEmployees()
	{
		return employeeRepository.findAll();
		
	}
	
	public Employee getEmployeeById(int id) 
	{
		return employeeRepository.findById(id).orElse(null);
	}
	
	public Employee saveEmployee(Employee employee) 
	{
		return employeeRepository.save(employee);
		
	}
	
	public void deleteEmployeById(int id) 
	{
		employeeRepository.deleteById(id);
	}
	
}
