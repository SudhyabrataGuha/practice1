package com.practice1.dto.task;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TaskRequestDto {

	@NotBlank
	@Pattern(regexp = "^[a-zA-Z0-9]+$")
	private String task;

	@NotBlank
	private String description;

	@NotNull
	private Integer assignedEmpId;

}
