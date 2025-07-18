package com.practice1.mapper.task;

import org.springframework.stereotype.Component;

import com.practice1.dto.task.TaskRequestDto;
import com.practice1.model.Task;
import com.practice1.service.EmployeeService;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class TaskMapper {

	private final EmployeeService es;

	public final Task toEntity(TaskRequestDto trd) {
		return Task.builder().task(trd.getTask()).description(trd.getDescription())
				.assignedTo(es.findEmployeeById(trd.getAssignedEmpId()))
				.build();
	}

}
