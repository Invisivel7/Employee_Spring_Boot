package com.crudSpringProject.employee.service;

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
}
