package com.atguigu.springboot.Test;

import com.atguigu.springboot.dao.AmountDao;
import com.atguigu.springboot.dao.StockDao;
import com.atguigu.springboot.entities.Stock;
import com.atguigu.springboot.service.AmountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StockTest {

    @Autowired
    private StockDao stockDao;

    @Autowired
    private AmountService amountService;

    @Test
    public  void doTest(){
        amountService.purchase();
     /*   List<Stock> stocks = stockDao.listStock();
        System.out.println(stocks.size());*/
        System.out.println("done");
    }

}
