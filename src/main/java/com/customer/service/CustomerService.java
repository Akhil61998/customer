package com.customer.service;

import java.util.List;

import com.customer.dto.CustomerDTO;
import com.customer.exception.InfyBankException;

public interface CustomerService {
	public String addCustomer(CustomerDTO customer) throws InfyBankException;
	public CustomerDTO getCustomer(Integer customerId) throws InfyBankException;
//	public List<CustomerDTO> findAll() throws InfyBankException;
//	public void updateCustomer(Integer customerId, String emailId) throws InfyBankException;
	String findNameByEmailId(String emailId);
	
	
//	void updateCustomerEmailId(String newEmailId, Integer customerId) throws InfyBankException;
//	void deleteCustomerByEmailId(String emailId) throws InfyBankException;
}
