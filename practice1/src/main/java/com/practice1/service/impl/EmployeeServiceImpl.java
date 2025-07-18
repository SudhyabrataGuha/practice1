package com.practice1.service.impl;

import org.springframework.stereotype.Service;

import com.practice1.exception.EmployeeNotFoundException;
import com.practice1.model.Employee;
import com.practice1.repo.EmployeeRepository;
import com.practice1.service.EmployeeService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
	
	private final EmployeeRepository er;
	
	@Override
	public Employee findEmployeeById(Integer empId) {
		return er.findById(empId).orElseThrow(() -> new EmployeeNotFoundException("Employee Not Found With These ID"));
	}

}
