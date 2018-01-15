package com.github.foreveraprogrammer.application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.foreveraprogrammer.application.entity.AppUser;

@RestController
public class ControllerWithClass {

	@RequestMapping("/user")
	public AppUser greetUser(@RequestParam(value = "name", defaultValue = "User") String name) {
		return new AppUser(1, name);
	}
}