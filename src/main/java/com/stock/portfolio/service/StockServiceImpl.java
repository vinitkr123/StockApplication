package com.stock.portfolio.service;

import java.util.List;

import com.stock.portfolio.dao.StockDaoRepo;
import com.stock.portfolio.model.Stock;

public class StockServiceImpl implements StockService {

	private StockDaoRepo StockDaoRepo;
	
	@Override
	public List<Stock> addStock(List<Stock> stock) {
		
		StockDaoRepo.saveAll(stock);
		
		return findAllStocks();
	}

	@Override
	public List<Stock> findAllStocks() {
		return StockDaoRepo.findAll();
	}

}
