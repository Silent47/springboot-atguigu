package com.mxb.springboot.yamldemo;

import com.mxb.springboot.yamldemo.bean.TestBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class YamlDemoApplicationTests {

    @Autowired
    private TestBean testBean;

    @Test
    void contextLoads() {
        System.out.println(testBean);
    }

}
