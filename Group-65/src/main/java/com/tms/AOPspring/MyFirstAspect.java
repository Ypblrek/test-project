package com.tms.AOPspring;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Aspect
@Component
public class MyFirstAspect {
    @Pointcut(value = "execution(public *  com.tms.AOPspring.*.*())")
    void emptyMethod() {
    }
    @After("emptyMethod()")
    public void checkPointcut(){
        System.out.println("Pointcut work!");


//    @Before(value = "@annotation(com.tms.Annotation.AspectAnnotation)")
//    public void startTimeEvent(JoinPoint joinPoint){
//        System.out.println(LocalTime.now() + " " + joinPoint.getSignature().getName() + " " + "method start working...");


//    @Before(value = "execution(public *  com.tms.AOPspring.*.*())")
//    public void startTimeEvent(JoinPoint joinPoint){
//        System.out.println(LocalTime.now() + " " + joinPoint.getSignature().getName() + " " + "method start working...");

    //    @Before(value = "within(com.tms.AOPspring.*)")
//    public void startTimeEvent(JoinPoint joinPoint){
//        System.out.println(LocalTime.now() + " " + joinPoint.getSignature().getName() + " " + "method start working...");
////        System.out.println(LocalDateTime.now() + "method start working...");
//    }
//    @Around(value = "within(com.tms.AOPspring.*) || within(com.tms.Servis.*)")
//    public Object aroundExampleMethod(ProceedingJoinPoint joinPoint) throws Throwable {
//        System.out.println("Method started" + " " + joinPoint.getSignature().getName());
//        Object returnValue = joinPoint.proceed();
//        System.out.println("Method finished" + " " + joinPoint.getSignature().getName());
//        return returnValue;
//    @Around(value = "@annotation(com.tms.Annotation.AspectAnnotation)")
//    public Object aroundExampleMethod(ProceedingJoinPoint joinPoint) throws Throwable {
//        LocalTime startTime = LocalTime.now();
//        Object returnValue = joinPoint.proceed();
//        LocalTime endTime = LocalTime.now();
//        System.out.println("Print return value from aspect:" + " " + (startTime.getNano() - endTime.getNano()));
//        return returnValue;
//    }
//@AfterThrowing(value = "within(com.tms.AOPspring.*)", throwing = "err")
//    public void printAfterThrow(Throwable err){
//    System.out.println(LocalTime.now() + err.toString());
//
//}
//
//    @AfterReturning(value = "within(com.tms.AOPspring.*)",returning = "retValue")
//    public void returned(Object retValue){
//        System.out.println("Print return value from aspect:" + retValue);
//
//
//    }
    }
}
