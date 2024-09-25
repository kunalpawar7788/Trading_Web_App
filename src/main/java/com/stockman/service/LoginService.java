package com.stockman.service;

import com.stockman.exception.LoginException;
import com.stockman.model.LoginDTO;

public interface LoginService {
	
	String logIntoAccount(LoginDTO dto)throws LoginException;

	String logOutFromAccount(String key)throws LoginException;

	String logIntoAccountAdmin(LoginDTO dto)throws LoginException;
	
	String logOutFromAccountAdmin(String key)throws LoginException;
}
