package com.tms.Spring;

import com.tms.Konfig.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

public class SpringStart {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringStart.class);
    }
}
