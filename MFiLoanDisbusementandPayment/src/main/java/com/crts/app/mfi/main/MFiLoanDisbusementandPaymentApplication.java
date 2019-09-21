package com.crts.app.mfi.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MFiLoanDisbusementandPaymentApplication {

	public static void main(String[] args)
	{
		System.out.println("Started");
		SpringApplication.run(MFiLoanDisbusementandPaymentApplication.class, args);
		System.out.println("Program Run Succefully");
	}

}
