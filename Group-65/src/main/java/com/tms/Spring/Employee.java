package com.tms.Spring;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Scope("singleton")
@Component(value = "employee-bean")
public class Employee{
    private Integer id;
    private String username;
    private  Integer age;
    private HRManager hrManager;

    public HRManager getHrManager() {
        return hrManager;
    }
    @Autowired
    public void setHrManager(HRManager hrManager) {
        this.hrManager = hrManager;
    }



    @PostConstruct
    public void init(){
        System.out.println("init method");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("destroy method");
    }

}
