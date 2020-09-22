package com.atguigu.springboot;

import com.atguigu.springboot.dao.EmployeeDao;
import com.atguigu.springboot.util.SpringContextUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class SpringBootWebRestfuldrudApplication  {


    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(SpringBootWebRestfuldrudApplication.class, args);
     //   EmployeeDao employeeDao=SpringContextUtil.getBean(EmployeeDao.class);
     //   System.out.println(employeeDao.toString());
          Map<String,Object>map= new HashMap<String,Object>();
          //map.put("test1","value1");

    }
}
