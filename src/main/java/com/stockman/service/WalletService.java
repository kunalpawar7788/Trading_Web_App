package com.stockman.service;

import com.stockman.exception.ResourceNotFoundException;
import com.stockman.model.Wallet;

public interface WalletService {

	void delete(Wallet wallet)throws ResourceNotFoundException;
	
}
