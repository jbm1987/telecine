package com.telecine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TelecineApplication {

	public static void main(String[] args) {
		SpringApplication.run(TelecineApplication.class, args);
	}

}
