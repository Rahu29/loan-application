package com.npci.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "loan_application")
public class LoanApplicationEntity {
	
	@Column(name = "application_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int application_id;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "customer_id_ref")
	private CustomerEntity customer_id_ref;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "loan_id_ref")
	private LoanEntity loan_id_ref;
	
	@Column(name = "status")
	private String status;

	public LoanApplicationEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoanApplicationEntity(int application_id, CustomerEntity customer_id_ref, LoanEntity loan_id_ref,
			String status) {
		super();
		this.application_id = application_id;
		this.customer_id_ref = customer_id_ref;
		this.loan_id_ref = loan_id_ref;
		this.status = status;
	}

	public int getApplication_id() {
		return application_id;
	}

	public void setApplication_id(int application_id) {
		this.application_id = application_id;
	}

	public CustomerEntity getCustomer_id_ref() {
		return customer_id_ref;
	}

	public void setCustomer_id_ref(CustomerEntity customer_id_ref) {
		this.customer_id_ref = customer_id_ref;
	}

	public LoanEntity getLoan_id_ref() {
		return loan_id_ref;
	}

	public void setLoan_id_ref(LoanEntity loan_id_ref) {
		this.loan_id_ref = loan_id_ref;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "LoanApplicationEntity [application_id=" + application_id + ", customer_id_ref=" + customer_id_ref
				+ ", loan_id_ref=" + loan_id_ref + ", status=" + status + "]";
	}
	
	
	
	
}
