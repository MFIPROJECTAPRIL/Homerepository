package com.crts.app.mfi.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MfiLoanProcessingAndSactioningEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MfiLoanProcessingAndSactioningEurekaServerApplication.class, args);
	}

}
