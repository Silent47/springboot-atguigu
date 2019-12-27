package com.mxb.springboot.yamldemo.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author Love
 */
@Component
@ConfigurationProperties(prefix = "test-bean")
public class TestBean {

    private int fieldInt;
    private boolean fieldBoolean;
    private String fieldString;
    private SubBean fieldObject;
    private List<SubBean> fieldList;
    private Map<String, SubBean> filedMap;

    private List<String> stringList;
    private Map<String, String> stringMap;

    @Override
    public String toString() {
        return "TestBean{" +
                "fieldInt=" + fieldInt +
                ", fieldBoolean=" + fieldBoolean +
                ", fieldString='" + fieldString + '\'' +
                ", fieldObject=" + fieldObject +
                ", fieldList=" + fieldList +
                ", filedMap=" + filedMap +
                ", stringList=" + stringList +
                ", stringMap=" + stringMap +
                '}';
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public Map<String, String> getStringMap() {
        return stringMap;
    }

    public void setStringMap(Map<String, String> stringMap) {
        this.stringMap = stringMap;
    }

    public int getFieldInt() {
        return fieldInt;
    }

    public void setFieldInt(int fieldInt) {
        this.fieldInt = fieldInt;
    }

    public boolean isFieldBoolean() {
        return fieldBoolean;
    }

    public void setFieldBoolean(boolean fieldBoolean) {
        this.fieldBoolean = fieldBoolean;
    }

    public String getFieldString() {
        return fieldString;
    }

    public void setFieldString(String fieldString) {
        this.fieldString = fieldString;
    }

    public SubBean getFieldObject() {
        return fieldObject;
    }

    public void setFieldObject(SubBean fieldObject) {
        this.fieldObject = fieldObject;
    }

    public List<SubBean> getFieldList() {
        return fieldList;
    }

    public void setFieldList(List<SubBean> fieldList) {
        this.fieldList = fieldList;
    }

    public Map<String, SubBean> getFiledMap() {
        return filedMap;
    }

    public void setFiledMap(Map<String, SubBean> filedMap) {
        this.filedMap = filedMap;
    }
}
