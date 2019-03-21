package com.jd.x.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by kongpeiling on 2018/12/5 21:07.
 */

@Controller
@SpringBootApplication
public class SpringBootApplicationTest {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationTest.class, args);

    }
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello springboot world！";
    }





}
