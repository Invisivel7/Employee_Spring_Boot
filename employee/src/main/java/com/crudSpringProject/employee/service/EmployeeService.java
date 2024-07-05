package com.crudSpringProject.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crudSpringProject.employee.entity.Employee;
import com.crudSpringProject.employee.repository.EmployeeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeService {

	private final EmployeeRepository employeeRepository;
	
	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	
	public Employee postEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
	
	public void deleteEmployee(Long id) {
		if(!employeeRepository.existsById(id)) {
			throw new Error("Employee with ID " + id + " not found");
		}
		
		employeeRepository.deleteById(id);
	}
}
