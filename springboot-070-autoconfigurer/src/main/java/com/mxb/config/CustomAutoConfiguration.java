package com.mxb.config;


import com.mxb.auto.properties.CustomProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(prefix = "mxb.custom", name = "enable", havingValue = "true")
@EnableConfigurationProperties(CustomProperties.class)
public class CustomAutoConfiguration {

}
