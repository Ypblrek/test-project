package com.tms.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.tms.Spring")
public class SpringConfig {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Employee employee = context.getBean("employee-bean", Employee.class);
//        Employee employee1 = context.getBean("employee-bean", Employee.class);

        System.out.println(employee.getHrManager().name);
//        System.out.println(employee1.hashCode());
//        ((ConfigurableApplicationContext) context).close();


    }
}