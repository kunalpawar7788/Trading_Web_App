package com.stockman.service;

import java.util.List;

import com.stockman.exception.StockException;
import com.stockman.model.Stock;

public interface AdminService {
	Stock addStock(Stock stock)throws StockException;

	List<Stock> getAllStocks()throws StockException;

	Stock findStockByName(String name)throws StockException;

	List<Stock> findByCustomers_Id(Integer id)throws StockException;
}
