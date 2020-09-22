package com.atguigu.springboot.entities;

public class Stock {

    private int stockNum;

    private  String guid;

    private  String stockName;

    private  String stockAmount;

    public int getStockNum() {
        return stockNum;
    }

    public void setStockNum(int stockNum) {
        this.stockNum = stockNum;
    }

    public String getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(String stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }
}
