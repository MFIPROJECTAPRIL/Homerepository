package com.crts.app.mfi.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@EnableEurekaServer
@SpringBootApplication
public class MfiEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MfiEurekaServerApplication.class, args);
	}

}
