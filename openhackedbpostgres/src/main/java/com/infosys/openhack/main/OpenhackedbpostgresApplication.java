package com.infosys.openhack.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.infosys.openhack")
public class OpenhackedbpostgresApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenhackedbpostgresApplication.class, args);
	}
}
