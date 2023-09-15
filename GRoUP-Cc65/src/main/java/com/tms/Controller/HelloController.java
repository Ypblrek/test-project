package com.tms.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main-path")
public class HelloController {
    @GetMapping("/hello")
    public String getHelloPage(){

        // логика , сервер , репозеторий

        return "HelloMVC";

    }
}
