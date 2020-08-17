package com.stock.portfolio.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stock.portfolio.model.Stock;

@Repository
public interface StockDaoRepo extends JpaRepository<Stock, String> {

	
	
}
