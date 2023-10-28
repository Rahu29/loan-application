package com.npci.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npci.dao.CustomerEntityDao;
import com.npci.entity.CustomerEntity;
import com.npci.exceptions.UserNotFoundException;
import com.npci.serviceInterface.CustomerServiceInterface;

@Service
public class CustomerServiceImpl implements CustomerServiceInterface{

	@Autowired
	private CustomerEntityDao custDao;
	
	@Override
	public CustomerEntity addCustomer(CustomerEntity customerEntity) {
		return custDao.save(customerEntity);
	}

	@Override
	public CustomerEntity login(String email_id, String password) throws UserNotFoundException {
			CustomerEntity res = custDao.login(email_id, password);
			if (res != null) {
				return res;
			} else {
				throw new UserNotFoundException("User not Found");
			}
	}

	@Override
	public CustomerEntity getCustomerById(int id) throws UserNotFoundException {
		Optional<CustomerEntity> res =  custDao.findById(id);
		return res.orElseThrow(() -> new UserNotFoundException("User with Id = "+id+" Doesn't Exist in Our System..."));
	}
	


}
