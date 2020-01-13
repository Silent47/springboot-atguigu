package com.mxb.controller;

import com.mxb.auto.component.CustomComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class CustomService {

    private CustomComponent component;

    @Autowired
    public void setComponent(CustomComponent component) {
        this.component = component;
    }

    @GetMapping("custom")
    @ResponseBody
    public String service(@RequestParam String str) {
        return component.wrap(str);
    }

    @GetMapping("fail")
    public int fail() {
        throw new RuntimeException();
    }

}
