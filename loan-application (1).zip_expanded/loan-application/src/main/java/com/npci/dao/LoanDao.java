package com.npci.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npci.entity.LoanEntity;

public interface LoanDao extends JpaRepository<LoanEntity, Integer> {

}
