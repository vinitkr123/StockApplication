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
	@Column
	private int stockId;
	
	@Column
	private String stockName;
	@Column
	private double stockValue;
	@Column
	private String stockSymbol;
	@Column
	private double stockPrice;
	
}
