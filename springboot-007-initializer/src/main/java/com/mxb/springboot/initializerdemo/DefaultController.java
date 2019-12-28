package com.mxb.springboot.initializerdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Love
 */
@RestController
public class DefaultController {

    @RequestMapping("/")
    public String root() {
        return "SpringBoot Initializer Demo";
    }

}
