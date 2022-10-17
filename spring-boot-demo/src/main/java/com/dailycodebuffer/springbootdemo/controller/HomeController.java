package com.dailycodebuffer.springbootdemo.controller;

import com.dailycodebuffer.springbootdemo.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){return "Hello World!, from Shanum ";}

    //@RequestMapping(value = "/user", method = RequestMethod.POST)
    @GetMapping("/user")
    public User user(){
        User user = new User();
        user.setId("1");
        user.setName("canum");
        user.setEmailId("canum@gmail.com");

        return user;
    }
    @GetMapping("/{id}/{id2}")
    public String pathVariable(@PathVariable String id,@PathVariable("id2") String name){
        return "the path variable is :"+ id +":" + name;
    }
    @GetMapping("/requestParam")
    public String requestParams(@RequestParam String name,@RequestParam(name="email",required = false,defaultValue = " ") String emailId){
        return " your name is : "+ name+ "and email is :" + emailId;
    }

}
