package com.mxb.springboot.yamldemo.propertysource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PropertySourceTest {

    @Autowired
    private ProperSourceBean bean;

    @Test
    public void test() {
        System.out.println(bean.getValue());
    }

}
