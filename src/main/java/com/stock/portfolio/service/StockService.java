package com.stock.portfolio.service;

import java.util.List;
import java.util.Optional;

import com.stock.portfolio.model.Stock;

public interface StockService {

	public List<Stock> addStock(List<Stock> stock);
	public List<Stock> findAllStocks();
	
}
