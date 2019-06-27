package com.example.MIcroservices.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroservicesController {
	
	@Value("${oc.secret}")
	private String secret;
	
	@GetMapping("/service1")
	public String ExternalAllocRequest() {
		return "Service 1 called";
	}
	
	@GetMapping("/getSecret")
	public String ExternalAllocApproval() {
		System.out.println("Secret retrieved:"+secret);
		return secret;
	}
	
	@GetMapping("/getfromservice2")
	public String FundsAlloc() {
		return "FundsAlloc";
	}
}
