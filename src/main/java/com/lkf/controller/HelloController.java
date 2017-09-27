package com.lkf.controller;

import com.lkf.code.ResponseCode;
import com.lkf.code.ResponseEntity;
import com.lkf.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * Created by likaifeng on 2017/7/17.
 */
@RestController
public class HelloController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/hello")
    public ResponseEntity index(){
        ResponseEntity responseEntity = new ResponseEntity();
        try{
            System.out.println("执行了.");
            responseEntity.success();
        }catch (Exception e){
            responseEntity.failure(ResponseCode.FAILURE.getCode(), ResponseCode.FAILURE.getMsg());
        }
        return responseEntity;
    }

    @RequestMapping("/hello1")
    public String index(@RequestParam String name){
        return "hello"+name;
    }

    @RequestMapping("/hello2")
    public User index(@RequestHeader String name,@RequestHeader Integer age){
        return new User(name,age);
    }

    @RequestMapping("/hello3")
    public String index(@RequestBody User user){
        return "hello"+user.getName()+","+user.getAge();
    }
}
