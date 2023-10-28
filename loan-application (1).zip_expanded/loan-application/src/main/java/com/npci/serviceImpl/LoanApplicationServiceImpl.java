package com.npci.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.npci.dao.LoanApplicationDao;
import com.npci.dto.ViewAllLoansDTO;
import com.npci.entity.LoanApplicationEntity;
import com.npci.serviceInterface.LoanApplicationInterface;

@Service
public class LoanApplicationServiceImpl implements LoanApplicationInterface {

	@Autowired
	private LoanApplicationDao loanAppDao;

	@Override
	public LoanApplicationEntity applyForLoan(LoanApplicationEntity loanApplication) {
		System.out.println(loanApplication.toString());
		return loanAppDao.save(loanApplication);
	}

	@Override
	public List<LoanApplicationEntity> allLoans() {
		return loanAppDao.findAll();
	}

	@Override
	public List<LoanApplicationEntity> findByCustId(int targetCustomerId) {
	    List<LoanApplicationEntity> allLoans = allLoans(); // Assuming this method retrieves all loan applications

	    // Create a list to store the filtered loan applications
	    List<LoanApplicationEntity> filteredLoans = new ArrayList<>();

	    for(LoanApplicationEntity loan : allLoans) {
	    
	    	if(loan.getCustomer_id_ref().getCustomer_id() == targetCustomerId) {
	    		filteredLoans.add(loan);
	    	}
	    }
	    return filteredLoans;
	}


	


}
