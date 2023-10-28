package com.npci.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npci.dao.LoanDao;
import com.npci.entity.LoanEntity;
import com.npci.serviceInterface.LoanInterface;


@Service
public class LoanServiceImpl implements LoanInterface{

	@Autowired
	public LoanDao loanDao;
	
	@Override
	public LoanEntity applyForLoan(LoanEntity loan) {
		return loanDao.save(loan);
	}

}
