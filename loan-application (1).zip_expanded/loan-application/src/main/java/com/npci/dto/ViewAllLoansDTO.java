package com.npci.dto;

import com.npci.entity.CustomerEntity;
import com.npci.entity.LoanEntity;

public class ViewAllLoansDTO {
    private int applicationId;
    private String status;
    private CustomerEntity customer;
    private LoanEntity loan;
	public ViewAllLoansDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ViewAllLoansDTO(int applicationId, String status, CustomerEntity customer, LoanEntity loan) {
		super();
		this.applicationId = applicationId;
		this.status = status;
		this.customer = customer;
		this.loan = loan;
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public CustomerEntity getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}

	public LoanEntity getLoan() {
		return loan;
	}

	public void setLoan(LoanEntity loan) {
		this.loan = loan;
	}

	@Override
	public String toString() {
		return "ViewAllLoansDTO [applicationId=" + applicationId + ", status=" + status + ", customer=" + customer
				+ ", loan=" + loan + "]";
	}
	
	
    
    

}
