package com.mxb.auto.component;

import com.mxb.auto.properties.CustomProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomComponent {

    private CustomProperties customProperties;

    @Autowired
    public void setCustomProperties(CustomProperties customProperties) {
        this.customProperties = customProperties;
    }

    public String wrap(String str) {
        return String.format("%s - %s - %s", customProperties.getPrefix(), str, customProperties.getSuffix());
    }

}
