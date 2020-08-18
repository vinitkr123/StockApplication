package com.stock.portfolio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Stock {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int StockId;
	
	@Column
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
	@Column
	private String StockSymbol;
	@Column
	private double StockPrice;
	
}
