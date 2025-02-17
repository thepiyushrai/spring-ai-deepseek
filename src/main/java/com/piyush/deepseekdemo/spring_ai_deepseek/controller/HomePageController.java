package com.piyush.deepseekdemo.spring_ai_deepseek.controller;

/**
 * @author Piyush Rai
 * @date 12/02/25
 * @time 8:09 am
 */




import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {

    @GetMapping
    public String home(){
        return "index";
    }
}
