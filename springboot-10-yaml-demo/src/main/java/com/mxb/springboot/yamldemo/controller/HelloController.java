package com.mxb.springboot.yamldemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Love
 */
@RestController
public class HelloController {

    @Value("${test-value}")
    private String string;

    /**
     * SpEL
     */
    @Value("#{222 + 234}")
    private int value;

    @RequestMapping("sayHello")
    public String sayHello() {
        return String.format("Hello %s %d!", string, value);
    }

}
