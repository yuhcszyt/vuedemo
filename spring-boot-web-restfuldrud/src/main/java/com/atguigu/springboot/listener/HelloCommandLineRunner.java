package com.atguigu.springboot.listener;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class HelloCommandLineRunner implements CommandLineRunner{

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("HelloCommandLineRunner CommandLineRunner");
    }
}
