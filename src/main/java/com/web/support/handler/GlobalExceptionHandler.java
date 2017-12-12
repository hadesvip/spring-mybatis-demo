package com.web.support.handler;

import com.alibaba.fastjson.JSON;
import com.web.support.http.ResponseBean;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {


    @ResponseBody
    @ExceptionHandler(Exception.class)
    public String hadlerException(Exception ex) {
        ResponseBean responseBean = ResponseBean.fail();
        return JSON.toJSONString(responseBean);
    }
}
