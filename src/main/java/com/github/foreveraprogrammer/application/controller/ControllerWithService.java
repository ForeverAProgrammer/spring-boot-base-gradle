package com.github.foreveraprogrammer.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.foreveraprogrammer.application.service.GreetingService;

@Controller
public class ControllerWithService {

	private final GreetingService service;

	public ControllerWithService(GreetingService service) {
		this.service = service;
	}

	@RequestMapping("/greeting")
	public @ResponseBody String greeting() {
		return service.greet();
	}

}