package com.spring.myproject.EmployeeRepo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.myproject.Employee.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{

	
}
