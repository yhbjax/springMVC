package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
//@RequestMapping("/hello")
public class RequestMappingController {
    //如果请求地址是一样的，另外一个里面也有，那就会报错
    //在控制器里面，只有一个请求地址才能映射。不能有两个
//    @RequestMapping("/")
//    public String index(){
//        return "target";
//    }
    //地址请求
    @RequestMapping(
            value = {"/testRequestMapping","/test",},
            method = {RequestMethod.GET,RequestMethod.POST}
    )

    public String success(){
        return "success";
    }

    @GetMapping("/testGetMapping")//@GetMapping要求请求方式必须是get
    public String testGetMapping(){
        return "success";
    }

    @PostMapping("/testPostMapping")//@PostMapping要求请求方式必须是Post
    public String testPostMapping(){
        return "success";
    }
    @RequestMapping(
            value = {"/testPut"},
            method ={RequestMethod.PUT}
    )
    public String testPut(){
        return "success";
    }

    @RequestMapping(
            value = {"/testParamsAndHeaders",},
            params = {"username","password=123456"},
            headers = {"Host=localhost:8080"}

    )
    public String testParamsAndHeaders(){
        return "success";
    }

    @RequestMapping("/a?a/testAnt")//?表示任意字符。
    public String testAnt(){
        return "success";
    }
    @RequestMapping("/a*a/testAnt1")//?表示任意字符。
    public String testAnt1(){
        return "success";
    }
    @RequestMapping("/**/testAnt2")//?表示任意字符。
    public String testAnt2(){
        return "success";
    }

    @RequestMapping("testPath/{id}/{username}")//{}表示占位符
    public String testPath(@PathVariable("id")Integer id,@PathVariable("username")String username){
        System.out.println("id:"+id + ",username:"+username);
        return "success";
    }
}
