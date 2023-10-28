package com.npci.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npci.dao.LoanApplicationDao;
import com.npci.entity.LoanApplicationEntity;
import com.npci.serviceInterface.EmployeeInterface;

@Service
public class EmployeeServiceImpl implements EmployeeInterface{

	@Autowired
	private LoanApplicationDao loanApplicationDao;
	
	@Override
	public List<LoanApplicationEntity> pendingApplications() {
		return loanApplicationDao.pendingApplication();
	}

}
