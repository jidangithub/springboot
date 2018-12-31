package org.logink.maque;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  
@ComponentScan  
@EnableAutoConfiguration 
public class HelloApplication {  
    public static void main(String[] args) {  
        SpringApplication.run(HelloApplication.class);  
    }  
}  
