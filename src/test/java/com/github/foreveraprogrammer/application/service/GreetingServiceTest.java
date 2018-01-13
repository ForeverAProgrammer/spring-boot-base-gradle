package com.github.foreveraprogrammer.application.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@WebMvcTest(GreetingService.class)
public class GreetingServiceTest {
	
	@Autowired
    private GreetingService greetingService;
	
	 @Test
	    public void serviceShouldReturnGreetMessage() throws Exception {
		 
		 assertEquals(greetingService.greet(),"Hello World");
	 }

}
