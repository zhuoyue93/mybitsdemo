package com.example.demo.feign;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface  LoginFeign {

    @RequestMapping(value = "https://api.weixin.qq.com/sns/jscode2session?appid=wxe6d855211ce9265e&secret=a657364bf3258a0260390010ade87c47&js_code=JSCODE&grant_type=authorization_code", method = RequestMethod.GET)
    public String login(String cost);
}
