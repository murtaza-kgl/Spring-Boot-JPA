package com.tarento.crypto.dto;


public class CryptoDto {
    private String name;
    private  String symbol;
    private double price;

    public String getName(){
        return this.name;
    }
    public String getSymbol() {
        return this.symbol;
    }
    public double getPrice(){
        return  this.price;
    }
}
