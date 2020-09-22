package com.atguigu.springboot.service;

import com.atguigu.springboot.entities.Stock;

public interface AmountService {

    public  boolean  purchase();

    public  boolean checkout(Stock stock);

}
