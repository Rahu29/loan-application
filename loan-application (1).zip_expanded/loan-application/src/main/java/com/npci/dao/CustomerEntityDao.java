package com.npci.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.npci.entity.CustomerEntity;

public interface CustomerEntityDao extends JpaRepository<CustomerEntity, Integer> {

	@Query("select c from CustomerEntity c where c.email_id = ?1 and c.password = ?2")
	public CustomerEntity login(String email, String password);
	
}
