package com.gunp.testEcom;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/v1")
public class Hello {
    @GetMapping("/hello") public String hello(){
        String a = "hello";
        System.out.print(a);
        return a;
    }
}
