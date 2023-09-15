package com.tms;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@OpenAPIDefinition(
        info = @Info (
                title = "Group 65 project",
                description= "This is pet project",
                contact = @Contact(
                        name = " Pozniak Egor",
                        email = "egorss@list.ru",
                        url = "@pozniakegor"
        )
  )
)

@SpringBootApplication
public class SpringBootGroupC65Application {

    public static void main(String[] args){
        SpringApplication.run(SpringBootGroupC65Application.class);
    }

}
