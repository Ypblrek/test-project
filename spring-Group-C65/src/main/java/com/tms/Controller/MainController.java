package com.tms.Controller;

import com.tms.Servise.Calculate;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @GetMapping("/")
    public  String start(){
        return "index";
    }
    @PostMapping("/calculate")
    public String calculate(@RequestParam("equation") String equation, Model model){
        // метод который считает и дает результат
        String result = Calculate.calculate(equation);
        model.addAttribute("result",result);
        return "result-page";
    }
}
