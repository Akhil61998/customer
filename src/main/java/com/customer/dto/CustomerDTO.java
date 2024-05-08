package com.customer.dto;

import java.time.LocalDate;

import lombok.Data;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class CustomerDTO {
	private Integer customerId;
	private String emailId;
	private String name;
	private LocalDate dateOfBirth;
    // getters and setters
    // toString method
}