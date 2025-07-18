package com.practice1.mapper.employee;

import org.springframework.stereotype.Component;

import com.practice1.dto.employee.EmployeeRequestDto;
import com.practice1.dto.employee.EmployeeResponseDto;
import com.practice1.model.Employee;

@Component
public class EmployeeMapper {

	public final Employee toEntity(EmployeeRequestDto erd) {
		return Employee.builder().eName(erd.getEName()).email(erd.getEmail()).password(erd.getPassword())
				.phoneNo(erd.getPhoneNo()).build();
	}

	public final EmployeeResponseDto toDto(Employee e) {
		return EmployeeResponseDto.builder().empId(e.getEmpId()).eName(e.getEName()).tasks(e.getTasks()).build();
	}
}
