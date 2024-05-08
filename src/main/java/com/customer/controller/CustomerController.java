package com.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.dto.CustomerDTO;
import com.customer.exception.InfyBankException;
import com.customer.service.CustomerService;

@RestController
@RequestMapping(value = "/akhil")
public class CustomerController {
	@Autowired
    private CustomerService customerService;
    @Autowired
    private Environment environment;
    @GetMapping(value = "/customer/{emailId}")
    public ResponseEntity<String> getAllCustomers(@PathVariable String emailId) throws InfyBankException {
        String customerList = customerService.findNameByEmailId(emailId);
        String successMessage = environment.getProperty("API.UPDATE_SUCCESS");

        return new ResponseEntity<>(customerList, HttpStatus.OK);
    }
    @GetMapping(value = "/customers/{customerId}")
    public ResponseEntity<CustomerDTO> getCustomer(@PathVariable Integer customerId) throws InfyBankException {
        CustomerDTO customer = customerService.getCustomer(customerId);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }
    @PostMapping(value = "/customers")
    public ResponseEntity<String> addCustomer(@RequestBody CustomerDTO customer) throws InfyBankException {
         String customerId =customerService.addCustomer(customer);
//        String successMessage = environment.getProperty("API.INSERT_SUCCESS") + customerId;
        return new ResponseEntity<>(customerId, HttpStatus.CREATED);
    }
//    @PutMapping(value = "/customers/{customerId}")
//    public ResponseEntity<String> updateCustomer(@PathVariable Integer customerId, @RequestBody CustomerDTO customer)
//            throws InfyBankException {
//        customerService.updateCustomer(customerId, customer.getEmailId());
//        String successMessage = environment.getProperty("API.UPDATE_SUCCESS");
//        return new ResponseEntity<>(successMessage, HttpStatus.OK);
//    }
//    @DeleteMapping(value = "/customers/{customerId}")
//    public ResponseEntity<String> deleteCustomer(@PathVariable Integer customerId) throws InfyBankException {
//        customerService.deleteCustomer(customerId);
//        String successMessage = environment.getProperty("API.DELETE_SUCCESS");
//        return new ResponseEntity<>(successMessage, HttpStatus.OK);
//    }

}
