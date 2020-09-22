package com.atguigu.springboot.dao;

import com.atguigu.springboot.entities.Amount;
import com.atguigu.springboot.entities.Stock;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AmountDao {

    public List<Amount> listAmount();

    public boolean updateAmount();

    public Stock getAmount(String id);

}
