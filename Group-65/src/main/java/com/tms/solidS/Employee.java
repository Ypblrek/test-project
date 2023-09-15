package com.tms.solidS;

import java.util.Date;

public class Employee {
    private int age;
    private String name;
    private String salary;
    private Date workTo;
    private  String position;
//    public void changeSalary(int salary){
//        int k= 1;
//        setSalary(salary+k);
//    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


    public void setSalary(String salary) {
        this.salary = salary;
    }
    public String getSalary() {
        return salary;
    }


    public void setWorkTo(Date workTo) {
        this.workTo = workTo;
    }
    public Date getWorkTo() {
        return workTo;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    public String getPosition() {
        return position;
    }

    public static class main {
    }
}
