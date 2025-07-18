package com.practice1.dto.employee;

import java.util.List;

import com.practice1.model.Task;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeResponseDto {

	private Integer empId;

	private String eName;

	private List<Task> tasks;

}
