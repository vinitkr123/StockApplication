package com.stock.portfolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stock.portfolio.model.Stock;
import com.stock.portfolio.service.StockServiceImpl;

@RestController()
public class StockDashboard {

	@Autowired
	StockServiceImpl stockService;
	
	@PostMapping("/addStock")
	public List<Stock> addStock(List<Stock> stock)
	{
		
		stockService.addStock(stock);
		return stock;
	}
	
	
}
