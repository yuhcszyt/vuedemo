package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@RestController
@Slf4j
public class PaymentController
{
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverport;

    @PostMapping(value = "/payment/create")
    public CommonResult<Payment> create(@RequestBody Payment payment)
    {
        int result=paymentService.create(payment);
        log.info("********插入结果："+result+"\t"+"haha!");
        if(result>0)
        {
            return  new CommonResult(200,"插入数据库成功"+serverport ,result);
        }else{
            return  new CommonResult(444,"插入数据库失败"+ serverport,null);
        }
    }
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id)
    {

        Payment payment=paymentService.getPaymentById(id);
        log.info("********查询结果："+payment+"\t"+"haha!");
       if(payment!=null)
       {
           return  new CommonResult(200,"查询成功"+serverport,payment);
       }else
       {
           return new CommonResult(444,"没有对应的记录，查询ID"+serverport ,null);
       }
    }
    @GetMapping(value = "/payment/lb")
    public String getPaymentLB(){
        return serverport;
    }

    @GetMapping(value = "/payment/feign/timeouts")
    public String paymentFeignTimeout() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return serverport;
    }
}
