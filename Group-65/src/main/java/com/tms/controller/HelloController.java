package com.tms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //Делает класс контроллером
public class HelloController {
    @GetMapping("/hello")
    public String getHelloPage(){

        // логика , сервер , репозеторий

        return "HelloMVC";

    }


}
