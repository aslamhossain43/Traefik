package com.traefik.main.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TraefikController {
	@RequestMapping(value = "/")
	public String saySomething() {
		return "From service-2";
	}
}
