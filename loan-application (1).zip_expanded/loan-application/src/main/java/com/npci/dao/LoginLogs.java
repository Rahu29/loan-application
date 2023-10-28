package com.npci.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npci.entity.LoanEntity;
import com.npci.entity.LoginLogsEntity;

public interface LoginLogs extends JpaRepository<LoginLogsEntity, Integer> {

}
