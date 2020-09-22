package com.yhc.swaggerdemo.controller;

import com.yhc.swaggerdemo.pojo.User;
import com.yhc.swaggerdemo.util.SpringContext1Util;
import com.yhc.swaggerdemo.util.SpringContextUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){

        ApplicationContext application= SpringContext1Util.getApplicationContext();
        //ApplicationContext application=SpringUtil.getContext();
        application.getEnvironment();
        return "hello yu";
    }

    @ApiOperation("这是哈喽YU")
    @RequestMapping(value = "/helloYu",method = RequestMethod.GET)
    public User helloUser(@ApiParam("用户名参") String username){
        User user=new User();
        user.setUserName(username);
        return  user;
    }

}
