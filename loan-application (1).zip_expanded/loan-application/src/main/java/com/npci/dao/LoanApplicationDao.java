package com.npci.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.npci.LoanApplication;
import com.npci.dto.ViewAllLoansDTO;
import com.npci.entity.LoanApplicationEntity;

public interface LoanApplicationDao extends JpaRepository<LoanApplicationEntity, Integer> {
	
	@Query("select l from LoanApplicationEntity l where l.customer_id_ref.customer_id = ?1")
	List<ViewAllLoansDTO> findByCustomerIdRef(int customerId);

	@Query("select l from LoanApplicationEntity l where l.status = 'Pending'")
	List<LoanApplicationEntity> pendingApplication();
	
}
