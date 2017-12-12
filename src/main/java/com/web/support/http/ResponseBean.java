package com.web.support.http;

import java.util.LinkedHashMap;

public class ResponseBean extends LinkedHashMap<String, Object> {


    public ResponseBean() {
    }


    public ResponseBean(String attrName, Object attrValue) {
        this.add(attrName, attrValue);
    }


    public ResponseBean add(String attrName, Object attrValue) {
        this.put(attrName, attrValue);
        return this;
    }


    public static ResponseBean create(String attrName, Object attrValue) {
        return new ResponseBean().set(attrName, attrValue);
    }

    public static ResponseBean ok() {
        return new ResponseBean().setOk();
    }


    public static ResponseBean fail() {
        return new ResponseBean().setFail();
    }


    public ResponseBean setOk() {
        super.put("code", "200");
        super.put("msg", "请求成功");

        return this;
    }

    public ResponseBean setFail() {
        super.put("code", "201");
        super.put("msg", "请求失败");

        return this;
    }


    public ResponseBean set(String key, Object value) {
        super.put(key, value);
        return this;
    }

}
