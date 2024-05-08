package com.customer;

import java.time.LocalDate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import com.customer.dto.CustomerDTO;
import com.customer.serviceImpl.CustomerServiceImpl;

@SpringBootApplication
public class CustomerApplication {
//implements CommandLineRunner {
	
//	public static final Log LOGGER = LogFactory.getLog(CustomerApplication.class);
//	@Autowired
//	CustomerServiceImpl customerService;
//	@Autowired
//	Environment environment;
	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}
//	public void run(String... args) throws Exception {
////		 addCustomer();
//		 getCustomer();
////		 findAllCustomers();
////		updateCustomer();
//	}
//	public void addCustomer() {
//		CustomerDTO customer = new CustomerDTO();
//		customer.setCustomerId(4);
//		customer.setEmailId("harry@infy.com");
//		customer.setName("Harry");
//		customer.setDateOfBirth(LocalDate.now());
//		try {
//			customerService.addCustomer(customer);
//			LOGGER.info(environment.getProperty("UserInterface.INSERT_SUCCESS"));
//		} catch (Exception e) {
//			if (e.getMessage() != null)
//				LOGGER.info(environment.getProperty(e.getMessage(),
//						"Something went wrong. Please check log file for more details."));
//		}
//	}
//	public void getCustomer() {
//		try {
//			CustomerDTO customer = customerService.getCustomer(1);
//			LOGGER.info(customer);
//		} catch (Exception e) {
//			if (e.getMessage() != null)
//				LOGGER.info(environment.getProperty(e.getMessage(),
//						"Something went wrong. Please check log file for more details."));
//		}
//	}
//	public void findAllCustomers() {
//		try {
//			customerService.findAll().forEach(LOGGER::info);
//		} catch (Exception e) {
//			if (e.getMessage() != null)
//				LOGGER.info(environment.getProperty(e.getMessage(),
//						"Something went wrong. Please check log file for more details."));
//		}
//	}
//	public void updateCustomer() {
//		try {
//			customerService.updateCustomer(2, "tom01@infy.com");
//			LOGGER.info(environment.getProperty("UserInterface.UPDATE_SUCCESS"));
//		} catch (Exception e) {
//			if (e.getMessage() != null)
//				LOGGER.info(environment.getProperty(e.getMessage(),
//						"Something went wrong. Please check log file for more details."));
//		}
//	}
	

//	public void run(String... args) throws Exception {
//		findNameByEmailId();
//		updateCustomerByEmailId();
//		deleteCustomerByEmailId();
//	}
//	
//	public void findNameByEmailId() {
//		try {
//			String name = customerService.findNameByEmailId("martin02@infy.com");
//			LOGGER.info("Customer name : " + name);
//		} catch (Exception e) {
//			if (e.getMessage() != null)
//				LOGGER.info(environment.getProperty(e.getMessage(),
//						"Something went wrong. Please check log file for more details."));
//		}
//	}
//	
//	public void updateCustomerByEmailId() {
//		try {
//			customerService.updateCustomerEmailId("martin02@infy.com", 1);
//			LOGGER.info(environment.getProperty("UserInterface.UPDATE_SUCCESS"));
//		} catch (Exception e) {
//			if (e.getMessage() != null)
//				LOGGER.info(environment.getProperty(e.getMessage(),
//						"Something went wrong. Please check log file for more details."));
//		}
//	}
//	public void deleteCustomerByEmailId() {
//		try {
//			customerService.deleteCustomerByEmailId("john@infy.com");
//			LOGGER.info(environment.getProperty("UserInterface.DELETE_SUCCESS"));
//		} catch (Exception e) {
//			if (e.getMessage() != null)
//				LOGGER.info(environment.getProperty(e.getMessage(),
//						"Something went wrong. Please check log file for more details."));
//		}
//	}
}