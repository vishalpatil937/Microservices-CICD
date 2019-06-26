package com.example.MIcroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MIcroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MIcroservicesApplication.class, args);
	}

}
