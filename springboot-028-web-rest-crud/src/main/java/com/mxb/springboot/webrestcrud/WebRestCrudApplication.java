package com.mxb.springboot.webrestcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * https://www.webjars.org/
 *
 * WebMvcAutoConfiguration
 *      /webjars/**
 *
 * ResourceProperties
 *      "classpath:/META-INF/resources/",
 * 		"classpath:/resources/",
 * 		"classpath:/static/",
 * 		"classpath:/public/"
 *
 * available:
 * http://localhost:8080/webjars/jquery/3.4.1/jquery.js
 * http://localhost:8080/static.txt
 * http://localhost:8080/public.txt
 * http://localhost:8080/resources.txt
 * http://localhost:8080/meta-resources.txt
 *
 * not available:
 * http://localhost:8080/application.properties
 * http://localhost:8080/application.yaml
 * http://localhost:8080/application.yml
 * http://localhost:8080/application.txt
 * http://localhost:8080/meta-others.txt
 *
 */
@SpringBootApplication
public class WebRestCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebRestCrudApplication.class, args);
    }

}
