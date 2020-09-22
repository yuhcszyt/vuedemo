package com.atguigu.springboot.listener;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class HelloApplicationRunnerListener implements SpringApplicationRunListener {

    public HelloApplicationRunnerListener(SpringApplication application, String[] args) {
    }

    @Override
    public void starting() {
        System.out.println("HelloApplicationRunnerListener starting");
    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment configurableEnvironment) {
        System.out.println("HelloApplicationRunnerListener environmentPrepared");

    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext configurableApplicationContext) {
        System.out.println("HelloApplicationRunnerListener contextPrepared");

    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext configurableApplicationContext) {
        System.out.println("HelloApplicationRunnerListener contextLoaded");

    }

    @Override
    public void finished(ConfigurableApplicationContext configurableApplicationContext, Throwable throwable) {
        System.out.println("HelloApplicationRunnerListener finished");

    }
}
