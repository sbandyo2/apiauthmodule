package com.ibm.authservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AuthServiceApplication {

	public static void main(String[] args) {

		SpringApplication springApplication = new SpringApplication(AuthServiceApplication.class);
		springApplication.addListeners(new ApplicationPidFileWriter("authservice.pid"));
		springApplication.run(args);
	}
}
