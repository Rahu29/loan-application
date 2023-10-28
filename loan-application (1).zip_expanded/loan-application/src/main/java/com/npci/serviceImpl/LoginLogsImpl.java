package com.npci.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npci.dao.LoginLogs;
import com.npci.entity.LoginLogsEntity;
import com.npci.serviceInterface.LoginLogsInterface;


@Service
public class LoginLogsImpl implements LoginLogsInterface{

	@Autowired
	private LoginLogs loginLogs;
	
	@Override
	public LoginLogsEntity addentry(LoginLogsEntity loginlog) {
		return loginLogs.save(loginlog);
	}
}
