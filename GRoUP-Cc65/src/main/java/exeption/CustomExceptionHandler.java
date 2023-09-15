package exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.IOException;

//@ControllerAdvice
//
//public class CustomExceptionHandler {
//    @ResponseStatus(value = HttpStatus.NOT_FOUND)
//    @ExceptionHandler({NullPointerException.class, IOException.class})
//    public String myExceptionHandler(Exception e) {
//        System.out.println(e);
//        return "Unsuccess";
//    }
//}