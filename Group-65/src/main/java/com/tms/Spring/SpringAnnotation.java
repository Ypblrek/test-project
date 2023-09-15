//package com.tms.Spring;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//@ComponentScan("com.tms.Spring")
//public class SpringAnnotation {
//    public static void main(String[] args) {
//
//        ApplicationContext context = new AnnotationConfigApplicationContext(SpringAnnotation.class);
//        Employee employee = context.getBean("employee-bean", Employee.class);
//        ((ConfigurableApplicationContext) context).close();
//
////        System.out.println(employee.hashCode());
//
//    }
////    @Bean(value = "employee-bean")
////    public static Employee employeeBean(){
////        return new Employee();
////    }
//}
