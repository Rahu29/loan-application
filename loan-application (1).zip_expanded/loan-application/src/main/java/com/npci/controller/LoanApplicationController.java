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

import com.npci.LoanApplication;
import com.npci.entity.CustomerEntity;
import com.npci.entity.LoanApplicationEntity;
import com.npci.exceptions.UserNotFoundException;
import com.npci.serviceImpl.LoanApplicationServiceImpl;
import com.npci.serviceInterface.CustomerServiceInterface;

@RestController
@RequestMapping("/loan-application/v1")
@CrossOrigin("*")
public class LoanApplicationController {

	@Autowired
	private LoanApplicationServiceImpl loanApplication;

	@Autowired
	private CustomerServiceInterface cust;

	@PostMapping("/apply-loan")
	public ResponseEntity<Object> applyForLoan(@RequestBody LoanApplicationEntity loanApplicationEntity) {
		CustomerEntity customer = new CustomerEntity();
		System.out.println(loanApplicationEntity.getCustomer_id_ref().getCustomer_id());
		try {
			customer = cust.getCustomerById(loanApplicationEntity.getCustomer_id_ref().getCustomer_id());
			loanApplicationEntity.setCustomer_id_ref(customer);
			loanApplicationEntity.setStatus("Pending");
			return ResponseEntity.status(201).body(loanApplication.applyForLoan(loanApplicationEntity));
		} catch (UserNotFoundException e) {
			e.printStackTrace();
			return ResponseEntity.status(404).body("User Not Found");
		}
	}

	@GetMapping("/all-loans")
	public ResponseEntity<Object> allLoans() {
		return ResponseEntity.status(404).body(loanApplication.allLoans());
	}
	
	@GetMapping("/getAllLoansById/{custId}")
	public ResponseEntity<Object> getAllLoans(@PathVariable("custId") int id) {
		return ResponseEntity.status(200).body(loanApplication.findByCustId(id));
	}

}
