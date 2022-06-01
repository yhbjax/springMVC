package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    //写一个控制器方法，用来请求映射
    //在请求请求映射方发中返回视图名称
    @RequestMapping("/testThymeleafView")
    public String testThymeleafView(){
        return "success";
    }
    @RequestMapping("/testForward")
    public String testForward(){
        return "forward:/testThymeleafView";
    }
    @RequestMapping("/testRedirect") 
    public String testRecirect(){
        //web-inf下的页面不能被重定向访问
        return "redirect:/testThymeleafView";
    }
}
