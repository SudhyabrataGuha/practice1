package com.practice1.dto.employee;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeRequestDto {

	@NotBlank
	@Pattern(regexp = "^[A-Za-z ]+$")
	private String eName;

	@NotBlank
	@Pattern(regexp = "^[6-9][0-9]{9}$")
	private String phoneNo;

	@Email
	@NotBlank
	private String email;

	@NotBlank
	private String password;

}
