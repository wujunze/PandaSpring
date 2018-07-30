package com.panda.PandaSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class PandaSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PandaSpringApplication.class, args);
	}
}
