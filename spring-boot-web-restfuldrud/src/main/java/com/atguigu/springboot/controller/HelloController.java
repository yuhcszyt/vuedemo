package com.atguigu.springboot.controller;

import com.sun.deploy.security.SelectableSecurityManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class HelloController {

    @RequestMapping("/success")
    public String hello(Map<String,Object> map){
        map.put("hello","nihao");
        return "success";
    }

    @RequestMapping("/index")
    public String index(){

        return "login";
    }

    @RequestMapping(value = "/user/login",method = RequestMethod.POST)
    public String login(@RequestParam("userName") String userName, @RequestParam("password")String password, Model model){

        if(!StringUtils.isEmpty(userName)&&"123456".equals(password)){
            return "redirect:/main";
        }else{
            model.addAttribute("msg","password error");
            return "login";
        }
    }

    @RequestMapping(value = "/main")
    public String main(){

        return  "dashboard";
    }
}
