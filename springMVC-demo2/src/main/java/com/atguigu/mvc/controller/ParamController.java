package com.atguigu.mvc.controller;

import com.atguigu.mvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;

@Controller
public class ParamController {
    //测试获取请求参数的功能
    //这是原生servlet，在SpringMVC里面很少使用
    //表示形参位置的request当前请求
    @RequestMapping("/testServletAPI")
    public String testServletAPI(HttpServletRequest request){
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username:" + username + ",password:" + password);
        return "success";
    }

    @RequestMapping("/testParam")
    public String testParam(
            @RequestParam(value = "user_name", required = false,defaultValue = "hehe") String username,
            String password,
            String[] hobby,
            @RequestHeader(value = "sayHaha", required = false,defaultValue = "请求头不存在") String host,
            @CookieValue("JSESSIONID")String JSESSIONID
    ){
        //若请求参数出现多个同名的请求参数，可以在控制器方法的形参位置设置字符串类型或字符串数组接收此请求参数
        //若使用字符串类型的形参，最终的结果为请求参数的每一个值之间使用逗号进行拼接
        System.out.println("username:" + username + ",password:" + password + ",hobby:" + Arrays.toString(hobby));
        System.out.println("Host:" + host);
        System.out.println("JSESSIONID:" + JSESSIONID);
        return "success";
    }
    @RequestMapping("/testBean")
    public String testBean(User user){
        System.out.println(user);
        return "success";
    }

}