package com.github.foreveraprogrammer.application.controller;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.github.foreveraprogrammer.application.entity.AppUser;

@RunWith(SpringRunner.class)
@WebMvcTest(ControllerWithClass.class)
public class ControllerWithClassTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void userWithoutParameterShouldReturnDefaultMessage() throws Exception {

		AppUser testUser = new AppUser(1, "User");

		mockMvc.perform(get("/user")).andExpect(status().isOk())
				.andExpect(jsonPath("$.id", equalTo(testUser.getId())))
				.andExpect(jsonPath("$.name", equalTo(testUser.getName())));
	}

	@Test
	public void userWithUserParameterShouldReturnCustomMessage() throws Exception {

		AppUser testUser = new AppUser(1, "Batman");

		mockMvc.perform(get("/user?name=Batman")).andExpect(status().isOk())
				.andExpect(jsonPath("$.id", equalTo(testUser.getId())))
				.andExpect(jsonPath("$.name", equalTo(testUser.getName())));
	}
}