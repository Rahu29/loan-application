package com.npci.serviceInterface;

import com.npci.entity.CustomerEntity;
import com.npci.exceptions.UserNotFoundException;

public interface CustomerServiceInterface {

	CustomerEntity addCustomer(CustomerEntity customerEntity);
	CustomerEntity login(String email_id, String password) throws UserNotFoundException;
	CustomerEntity getCustomerById(int id) throws UserNotFoundException;
	
}
