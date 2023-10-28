package com.npci.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import com.npci.entity.CustomerEntity;
import com.npci.entity.LoginLogsEntity;
import com.npci.exceptions.UserNotFoundException;
import com.npci.serviceImpl.LoginLogsImpl;
import com.npci.serviceInterface.CustomerServiceInterface;
import com.npci.serviceInterface.LoginLogsInterface;

@RestController
@RequestMapping("/customer/v1")
@CrossOrigin("*")
public class CustomerEntityController {
	@Autowired
	LoginLogsInterface loginLogsImpl;
	
	@Autowired
	private CustomerServiceInterface customerServiceInterface;
	
	@PostMapping("/add-customer")
	public ResponseEntity<Object> addCustomer(@RequestBody CustomerEntity customerEntity){
		CustomerEntity res = customerServiceInterface.addCustomer(customerEntity);
		return ResponseEntity.status(201).body(res);
	}

	@PostMapping("/login")
	public ResponseEntity<Object> login(@RequestBody CustomerEntity customerEntity){
		CustomerEntity res = new CustomerEntity();
		try {
			res = customerServiceInterface.login(customerEntity.getEmail_id(), customerEntity.getPassword());
			if(res != null) {
				LoginLogsEntity a = new LoginLogsEntity();
				a.setCust_id(res.getCustomer_id());
				a.setStatus(1);
				loginLogsImpl.addentry(a);
			}
			return ResponseEntity.status(201).body(res);
		} catch (UserNotFoundException e) {
			e.printStackTrace();
				LoginLogsEntity a = new LoginLogsEntity();
				a.setCust_id(customerEntity.getCustomer_id());
				a.setStatus(0);
				loginLogsImpl.addentry(a);
			return ResponseEntity.status(404).body("not found");
		}
	}
	
	@GetMapping("/get-cust-by-id/{id}")
	public ResponseEntity<Object> addCustomer(@PathVariable("id") int id) throws UserNotFoundException{
		return ResponseEntity.status(201).body(customerServiceInterface.getCustomerById(id));
	}
	
	
}
