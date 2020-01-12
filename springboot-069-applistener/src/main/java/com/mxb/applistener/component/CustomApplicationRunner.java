package com.mxb.applistener.component;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CustomApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) {
        System.out.printf("%s: %s -> %s\n", getClass(), "run", Arrays.toString(args.getSourceArgs()));
    }
}
