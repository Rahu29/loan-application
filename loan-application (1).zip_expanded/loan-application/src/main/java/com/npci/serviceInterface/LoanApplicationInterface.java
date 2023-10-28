package com.npci.serviceInterface;

import java.util.List;

import com.npci.entity.LoanApplicationEntity;

public interface LoanApplicationInterface {
	LoanApplicationEntity applyForLoan(LoanApplicationEntity loanApplication);
	List<LoanApplicationEntity> allLoans();
	
	List<LoanApplicationEntity> findByCustId(int id);
}
