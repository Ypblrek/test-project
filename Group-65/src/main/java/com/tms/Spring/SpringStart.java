package com.tms.Spring;

import com.tms.AOPspring.AspectTestClass;
import com.tms.Konfig.SpringConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringStart{
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

//        AspectTestClass aspectTestClass = context.getBean("aspectTestClass", AspectTestClass.class);
//        aspectTestClass.printOne();
//        aspectTestClass.returnTen();
//        Employee employee = context.getBean("employee-bean", Employee.class);

//        System.out.println(employee.hashCode());


    }
}
