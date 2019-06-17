package com.eureka.microservice2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class Microservice2Controller {

	@Autowired
	Microserviceproxy proxy;
	
	@RequestMapping("/service2")
	public String service2() {
		return "Fetched from service1: "+proxy.ExternalAllocRequest();
	}
}
