package com.atguigu.mvc.controller;

import com.atguigu.mvc.bean.User;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class HttpController {
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String requestBody){
        System.out.println("requestBody" + requestBody);
        return "success";
    }
    @RequestMapping("/testRequestEntity")
    public String testRequestEntity(RequestEntity<String> requestEntity){
        //表示当前requestEntity整个请求报文信息
        System.out.println("请求头：" + requestEntity.getHeaders());//后面还可以.xxx用来获取跟多信息
        System.out.println("请求体：" + requestEntity.getBody());
        return "success";
    }
    @RequestMapping("/testResponse")
    public void testResponse(HttpServletResponse response) throws IOException {//抛异常是因为getWriter()方法要实现IO流
        response.getWriter().print("hello Response");
    }
    //请求映射
    @RequestMapping("/testResponseBody")
    @ResponseBody//用来标识控制器方法的
    public String testResponseBody(){
        //如果去掉了@Response，这个return就是返回一个视图名称，加上就是返回自己的响应浏览器数据，响应体。
        return "success";
    }
    @RequestMapping("/testResponseUser")
    @ResponseBody
    public User testResponseUser(){
        return new User(1001,"admin","123456",23,"男");
    }

    @RequestMapping("/testAxios")
    @ResponseBody
    public String testAxios(String username,String password){
        System.out.println(username + ","+password);
        return "hello,axios";
    }
}
