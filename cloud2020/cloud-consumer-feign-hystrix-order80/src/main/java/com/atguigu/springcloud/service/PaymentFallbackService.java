package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements  PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "80客户端异常请稍后再试 ok业务";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "80客户端异常请稍后再试 TimeOut业务";
    }
}
