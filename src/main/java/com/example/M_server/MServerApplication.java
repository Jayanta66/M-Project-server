package com.example.M_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MServerApplication.class, args);
	}

}
