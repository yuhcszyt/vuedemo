package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;

@Component
public class MyLB implements LoadBalancer{

    private AtomicInteger atomicInteger=new AtomicInteger(0);
    private AtomicStampedReference<Integer> atomicInteger1=new AtomicStampedReference<Integer> (0,1);

    public final int getAndIncrement() {
        int current;
        int next;
        do {
            current=this.atomicInteger.get();
            next=current>=2147483647 ? 0 :current + 1;
        }while (!this.atomicInteger.compareAndSet(current,next));
        return  next;
    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {

        int index=getAndIncrement()%serviceInstances.size();
        ServiceInstance serviceInstance=serviceInstances.get(index);
        return serviceInstance;
    }
}


