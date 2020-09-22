package com.atguigu.springboot.entities;

public class Amount {

    private String guid;
    private String stockguid;
    private String totalamount;

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getStockguid() {
        return stockguid;
    }

    public void setStockguid(String stockguid) {
        this.stockguid = stockguid;
    }

    public String getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(String totalamount) {
        this.totalamount = totalamount;
    }
}
