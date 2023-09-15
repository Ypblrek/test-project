package com.tms.Controller;

import jakarta.validation.Valid;
import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("/get-user")
    public String getUser(@Valid @ModelAttribute User user, BindingResult bindingResult) {
//        System.out.println(user.getId().equals(1));
            if (bindingResult.hasErrors()) {
                System.out.println(bindingResult.getAllErrors());
                return "Unsuccess";

            }
        System.out.println(user);
                return "Success";
        }
//        @ExceptionHandler({NullPointerException.class, IOException.class})
//        public String myExceptionHandler(Exception e){
//            System.out.println(e);
//            return "Unsuccess";
//        }
    }
