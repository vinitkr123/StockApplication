package com.stock.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.portfolio.dao.StockDaoRepo;
import com.stock.portfolio.model.Stock;

@Service
public class StockServiceImpl implements StockService {

	@Autowired
	private StockDaoRepo StockDaoRepo;

	@Override
	public List<Stock> addStock(Stock stock) {

		Stock save = StockDaoRepo.save(stock);
		return findAllStocks();
	}

	@Override
	public List<Stock> findAllStocks() {
		return StockDaoRepo.findAll();
	}

	@Override
	public List<Stock> addStock(List<Stock> stock) {
		// TODO Auto-generated method stub
		return null;
	}

}
