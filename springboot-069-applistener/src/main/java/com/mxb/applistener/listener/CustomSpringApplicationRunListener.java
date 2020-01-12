package com.mxb.applistener.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Arrays;

public class CustomSpringApplicationRunListener implements SpringApplicationRunListener {

    public CustomSpringApplicationRunListener(SpringApplication application, String[] args) {
        System.out.printf("%s: %s -> %s, %s\n", getClass(), "constructor", application, Arrays.toString(args));
    }

    @Override
    public void starting() {
        System.out.printf("%s: %s\n", getClass(), "starting");
    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {
        System.out.printf("%s: %s\n", getClass(), "environmentPrepared");
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        System.out.printf("%s: %s\n", getClass(), "contextPrepared");
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        System.out.printf("%s: %s\n", getClass(), "contextLoaded");
    }

    @Override
    public void started(ConfigurableApplicationContext context) {
        System.out.printf("%s: %s\n", getClass(), "started");
    }

    @Override
    public void running(ConfigurableApplicationContext context) {
        System.out.printf("%s: %s\n", getClass(), "running");
    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        System.out.printf("%s: %s\n", getClass(), "failed");
    }

}
