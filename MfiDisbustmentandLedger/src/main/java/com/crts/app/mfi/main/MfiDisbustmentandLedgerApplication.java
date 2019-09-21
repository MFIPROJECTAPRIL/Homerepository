package com.crts.app.mfi.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class MfiDisbustmentandLedgerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MfiDisbustmentandLedgerApplication.class, args);
	}

}
