package com.npci.serviceInterface;

import java.util.List;

import com.npci.entity.LoanApplicationEntity;

public interface EmployeeInterface {
	List<LoanApplicationEntity> pendingApplications();
}
