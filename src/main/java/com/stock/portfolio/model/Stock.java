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
	@Column
	private double StockValue;
	@Column
	private String StockSymbol;
	@Column
	private double StockPrice;
	
}
