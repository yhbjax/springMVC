package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    //控制器，页面跳转
//    @RequestMapping("/")
//    public String index(){
//        return "index";
//    }
    @RequestMapping("/test_view")
    public String testView() {
        return "test_view";
    }

    @RequestMapping("/test_rest")
    public String testRest(){
        return "test_rest";
    }
}
