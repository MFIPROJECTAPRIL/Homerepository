package com.crts.app.mfi.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MfiLoanDisbursementAndPaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(MfiLoanDisbursementAndPaymentApplication.class, args);
	}

}
