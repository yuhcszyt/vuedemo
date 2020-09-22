package com.atguigu.springboot.service.impl;


import com.atguigu.springboot.dao.AmountDao;
import com.atguigu.springboot.dao.StockDao;
import com.atguigu.springboot.entities.Amount;
import com.atguigu.springboot.entities.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AmountServiceImpl implements com.atguigu.springboot.service.AmountService {

    @Autowired
    private AmountDao amountDao;

    @Autowired
    private StockDao stockDao;

    @Override
    public boolean purchase() {

        List<Stock> stockList = stockDao.listStock();

        for (Stock stock1 : stockList) {
            checkout(stock1);
            System.out.println("done1 checkout");
        }
        System.out.println("done1 purchase");
        return false;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public boolean checkout( Stock stock) {
        stock.setStockNum(stock.getStockNum()-1);
        stockDao.updateStock(stock);
        return false;
    }
}
