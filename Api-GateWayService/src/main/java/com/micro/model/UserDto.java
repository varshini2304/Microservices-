package com.micro.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDto {
	private String firstname;
	private String lastname;
	private int age;
	private String email;
	private String gender;
}
