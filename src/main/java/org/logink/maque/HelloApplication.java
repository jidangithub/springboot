package org.logink.maque;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  
@ComponentScan  
@EnableAutoConfiguration 
public class HelloApplication {  
	private static final Logger LOGGER = LoggerFactory.getLogger(HelloApplication.class);
	  
    public static void main(String[] args) {  
    	LOGGER.info("spring boot application start - test ali arms");
        SpringApplication.run(HelloApplication.class);  
        LOGGER.info("spring boot application start completed - test ali arms");
    }  
}  
