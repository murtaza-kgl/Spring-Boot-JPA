package com.tarento.crypto.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Coin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String symbol;
	private double price;

//	public Coin(String name,String symbol,double price){
//		this.name = name;
//		this.symbol = symbol;
//		this.price = price;
//	}

	public long getId(){
		return this.id;
	}

	public String getName(){
		return this.name;
	}

	public String getSymbol(){
		return this.symbol;
	}
	public double getPrice(){
		return this.price;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setSymbol(String symbol){
		this.symbol = symbol;
	}
	public void setPrice(double price){
		this.price = price;
	}
}
