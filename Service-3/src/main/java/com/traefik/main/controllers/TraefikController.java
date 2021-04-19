package com.traefik.main.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TraefikController {
	@Value("${server.port}")
	private int serverPort;

	@RequestMapping(value = "/api/s3")
	public String saySomething() {
		return "From service-3, Port: " + serverPort;
	}
}
