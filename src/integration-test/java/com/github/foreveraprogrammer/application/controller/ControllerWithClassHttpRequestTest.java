package com.github.foreveraprogrammer.application.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.github.foreveraprogrammer.application.entity.AppUser;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ControllerWithClassHttpRequestTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void userWithoutUserNameShouldReturnDefaultMessage() throws Exception {
    	AppUser testUser = new AppUser(1, "User");
    	
    	assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/user",
                String.class).equals(testUser.toString()));
    }
    
    @Test
    public void userWithUserNameShouldReturnCustomMessage() throws Exception {
    	AppUser testUser = new AppUser(1, "Batman");
    	
    	assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/user?Batman",
                String.class).equals(testUser.toString()));
    }
}
