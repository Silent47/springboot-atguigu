package com.mxb.springboot.web.rest.crud.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

/**
 * @author Love
 */
@Controller
public class HelloController {

    @RequestMapping({"/", "index.html"})
    public String index() {
        return "index";
    }

    @ResponseBody
    @RequestMapping("hello")
    public String hello() {
        return "Hello World";
    }

    @RequestMapping("success")
    public String success(Map<String, Object> map) {
        map.put("code", 321);
        map.put("div", "<h2>title 2</h2>");
        map.put("array", Arrays.asList("<b>a</b>", "<i>b</i>", "<u>c</u>", "<s>d</s>"));

        return "success";
    }

}
