package com.customer.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.dto.CustomerDTO;
import com.customer.entity.Customer;
import com.customer.exception.InfyBankException;
import com.customer.repository.CustomerRepository;
import com.customer.service.CustomerService;

@Service

public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository customerRespository;
	@Override
	public String addCustomer(CustomerDTO customerDto) throws InfyBankException {
		Optional<Customer> optional = customerRespository.findById(customerDto.getCustomerId());
		if (optional.isPresent())
			throw new InfyBankException("Service.CUSTOMER_FOUND");
		Customer customer = new Customer();
		customer.setDateOfBirth(customerDto.getDateOfBirth());
		customer.setEmailId(customerDto.getEmailId());
		customer.setName(customerDto.getName());
		customer.setCustomerId(customerDto.getCustomerId());
		customerRespository.save(customer);
		
		  return "success";
	}
//	
	@Override
	public CustomerDTO getCustomer(Integer customerId) throws InfyBankException {
		Optional<Customer> optional = customerRespository.findById(customerId);
		Customer customer = optional.orElseThrow(() -> new InfyBankException("Service.CUSTOMER_NOT_FOUND"));
		CustomerDTO customerDto = new CustomerDTO();
		customerDto.setCustomerId(customer.getCustomerId());
		customerDto.setDateOfBirth(customer.getDateOfBirth());
		customerDto.setEmailId(customer.getEmailId());
		customerDto.setName(customer.getName());
		return customerDto;
	}
//	@Override
//	public List<CustomerDTO> findAll() throws InfyBankException {
//		Iterable<Customer> customers = customerRespository.findAll();
//		List<CustomerDTO> customerDTOs = new ArrayList<>();
//		customers.forEach(customer -> {
//			CustomerDTO customerDto = new CustomerDTO();
//			customerDto.setCustomerId(customer.getCustomerId());
//			customerDto.setDateOfBirth(customer.getDateOfBirth());
//			customerDto.setEmailId(customer.getEmailId());
//			customerDto.setName(customer.getName());
//			customerDTOs.add(customerDto);
//		});
//		if (customerDTOs.isEmpty())
//			throw new InfyBankException("Service.CUSTOMERS_NOT_FOUND");
//		return customerDTOs;
//	}
//	
//	
//	@Override
//	public void updateCustomer(Integer customerId, String emailId) throws InfyBankException {
//		Optional<Customer> optional = customerRespository.findById(customerId);
//		Customer customer = optional.orElseThrow(() -> new InfyBankException("Service.CUSTOMER_NOT_FOUND"));
//		customer.setEmailId(emailId);
//	}
	
	@Override
	public String findNameByEmailId(String emailId) {
		return customerRespository.findNameByEmailId(emailId);
	}
	
//	@Override
//	public void updateCustomerEmailId(String newEmailId, Integer customerId) throws InfyBankException {
//		Optional<Customer> optional = customerRespository.findById(customerId);
//		optional.orElseThrow(() -> new InfyBankException("Service.CUSTOMER_UNAVAILABLE"));
//		
//		customerRespository.updateCustomerEmailId(newEmailId, customerId);
//		
//	}
//	@Override
//	public void deleteCustomerByEmailId(String emailId) throws InfyBankException {
//		// Optional<CustomerEntity> customer = customerRespository.fi
//		Integer count = customerRespository.deleteCustomerByEmailId(emailId);
//		if (count == 0)
//			throw new InfyBankException("Service.CUSTOMER_UNAVAILABLE");
//	}
}
