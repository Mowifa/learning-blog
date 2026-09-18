package org.mowifa.demo.controller;

import org.mowifa.demo.entity.User;
import org.springframework.web.bind.annotation.*;

//用于接收请求的注解
@RestController
//接口:http://localhost:8080/hello/hello
@RequestMapping("/hello")
public class HelloController {
//    从路径中进行前后端传参,为路径传参,直接输入路径
//    @GetMapping("/hello/{name}")
//    public String hello(@PathVariable String name){
//        System.out.println(name);

//    用@RequestParam注解进行前后端传参,为问号传参(?name=张三)
//    public String hello(@RequestParam(defaultValue = "") String name) {
//        System.out.println(name);
//使用requestbody进行传参
   @PostMapping("/user")
    public String hello(@RequestBody User user){
       System.out.println("name:"+user.getName());
       System.out.println("age:"+user.getAge());
        return "hello world";
    }
}
