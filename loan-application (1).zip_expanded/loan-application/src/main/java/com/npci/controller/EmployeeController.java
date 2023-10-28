package com.npci.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.npci.serviceInterface.EmployeeInterface;

@RestController
@RequestMapping("/employee/v1")
@CrossOrigin("*")
public class EmployeeController {
	
	@Autowired
	private EmployeeInterface employeeInterface;
	
	@GetMapping("/pendingApplications")
	public ResponseEntity<Object> pendingApplications() {
		return ResponseEntity.status(404).body(employeeInterface.pendingApplications());
	}

}
