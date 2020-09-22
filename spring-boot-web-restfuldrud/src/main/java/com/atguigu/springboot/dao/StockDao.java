package com.atguigu.springboot.dao;

import com.atguigu.springboot.entities.Stock;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StockDao {

    public List<Stock> listStock();

    public boolean updateStock(Stock stock);

    public Stock getStock(String id);

}
