package com.example.demo_sec;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class MainController {


    @GetMapping
    public String main(){
        return "Main PAGE";
    }

    @GetMapping("/test")
    public String test(){
        return "TEST";
    }

}
