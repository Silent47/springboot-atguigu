package com.mxb.applistener.component;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CustomCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) {
        System.out.printf("%s: %s -> %s\n", getClass(), "run", Arrays.toString(args));
    }
}
