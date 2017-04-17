package com.senyint.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by hanpeng on 2017/4/17.
 */
@Controller
public class TestController {

    @RequestMapping(value = "/test")
    public String Test(){
        System.out.println("hahaha");
        return "test";
    }

    @RequestMapping("/test1")
    public String Test1(Map<String, Object> map){
        System.out.println("test1");
        map.put("test","test");
        return "test2";
    }
}
