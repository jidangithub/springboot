package org.logink.maque;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** 
 * <p>User: Yin Jidan
 * <p>Date: 17-5-27
 * <p>Version: 1.0 
 */   
@RestController  
@RequestMapping("/user")  
public class UserController {  
	private static final Logger LOGGER = LoggerFactory.getLogger(HelloApplication.class);
	
    @RequestMapping("/hello")  
    public String hello() {  
    	LOGGER.info("hello() invoked - test ali arms");
        return "Hello World";  
    }  
  
}  