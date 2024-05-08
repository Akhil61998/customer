package com.customer.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;



import lombok.Data;

@Entity
@Data
public class Customer {
    @Id
    @Column(name="customer_id")
    private Integer customerId;
    @Column(name="email_id")
	private String emailId;
    @Column(name="name")
	private String name;
    @Column(name="date_of_birth")
	private LocalDate dateOfBirth;
  
    
}
