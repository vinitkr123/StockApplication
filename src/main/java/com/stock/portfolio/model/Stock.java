package com.stock.portfolio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Required;

@Entity
@Table
public class Stock {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int StockId;
	
	@Column(nullable = false,unique = true)
	private String StockName;
	public int getStockId() {
		return StockId;
	}
	public void setStockId(int stockId) {
		StockId = stockId;
	}
	public String getStockName() {
		return StockName;
	}
	public void setStockName(String stockName) {
		StockName = stockName;
	}
	public double getStockValue() {
		return StockValue;
	}
	public void setStockValue(double stockValue) {
		StockValue = stockValue;
	}
	public String getStockSymbol() {
		return StockSymbol;
	}
	public void setStockSymbol(String stockSymbol) {
		StockSymbol = stockSymbol;
	}
	public double getStockPrice() {
		return StockPrice;
	}
	public void setStockPrice(double stockPrice) {
		StockPrice = stockPrice;
	}
	@Column
	private double StockValue;
	@Column(nullable = false)
	private String StockSymbol;
	@Column(nullable = false)
	private double StockPrice;
	
}
