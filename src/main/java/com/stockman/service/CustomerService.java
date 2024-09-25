package com.stockman.service;

import java.util.List;

import com.stockman.exception.CustomerException;
import com.stockman.exception.ResourceNotFoundException;
import com.stockman.exception.StockException;
import com.stockman.model.Customer;
import com.stockman.model.Stock;
import com.stockman.model.Transaction;

public interface CustomerService {
	
	
	Customer createCustomer(Customer customer)throws CustomerException;
	
	Customer updateCustomer(Customer customer,String key)throws CustomerException;

	List<Customer> getAllCustomers()throws CustomerException;

	Customer findCustomerById(Integer id)throws CustomerException;

	List<Stock> getAllStocks(String key)throws CustomerException;

	Transaction buyStockByName(Integer customerId, String stockName, Integer shares)
	throws CustomerException,StockException,ResourceNotFoundException;

	Transaction sellStockByName(Integer customerId, String stockName, Integer shares)
			throws CustomerException,StockException,ResourceNotFoundException;

	Customer save(Customer customer)throws CustomerException;

	void delete(Customer customer)throws CustomerException;

	
}





