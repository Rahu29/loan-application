package com.npci.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.npci.entity.CustomerEntity;
import com.npci.entity.LoanEntity;
import com.npci.serviceInterface.CustomerServiceInterface;
import com.npci.serviceInterface.LoanInterface;

@RestController
@RequestMapping("/loan/v1")
@CrossOrigin("*")
public class LoanController {

	@Autowired
	private LoanInterface loanInterface;
	
	@PostMapping("/add-customer")
	public ResponseEntity<Object> addCustomer(@RequestBody LoanEntity loanEntity){
		return ResponseEntity.status(201).body(loanInterface.applyForLoan(loanEntity));
	}
	
}
