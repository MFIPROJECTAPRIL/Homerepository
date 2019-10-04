package com.crts.app.mfi.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



//@EnableEurekaClient
@SpringBootApplication
public class MfiLoanProcessingAndSanctioningApplication {

	public static void main(String[] args) {
		System.out.println("start");
		SpringApplication.run(MfiLoanProcessingAndSanctioningApplication.class, args);
	}

}
