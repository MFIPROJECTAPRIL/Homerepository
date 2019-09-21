package com.crts.app.mfi.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class MfiMasterServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MfiMasterServiceApplication.class, args);
	}

}
