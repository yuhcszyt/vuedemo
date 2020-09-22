package com.yhc.swaggerdemo.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


@Component
public class SpringContext1Util implements ApplicationContextAware {

    /*private  static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }

    public  static  ApplicationContext getContext(){
        return applicationContext;
    }*/

    private static ApplicationContext applicationContext;

    @Autowired
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }

    public static ApplicationContext getApplicationContext(){
        return applicationContext;
    }

}
