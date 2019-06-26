package com.eureka.microservice2.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="microservices" )
public interface Microserviceproxy {
	
	@RequestMapping("/service1")
	public String ExternalAllocRequest();
}
