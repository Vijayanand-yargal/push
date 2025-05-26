package com.spring.myproject.Employee;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "details")

public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String name;
private String department;
private Double slary;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public Double getSlary() {
	return slary;
}
public void setSlary(Double slary) {
	this.slary = slary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", slary=" + slary + "]";
}
public Employee(int id, String name, String department, Double slary) {
	super();
	this.id = id;
	this.name = name;
	this.department = department;
	this.slary = slary;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

}
