package com.controller;

import com.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author created by wangyong on 17-11-12
 */
@RestController
public class HomeController {

    @GetMapping("/index")
    public String index() {
        User user = null;

        user.hashCode();

        return "hello,index...";
    }


}
