package com.dc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableAutoConfiguration
public class SampleBackend {
	
	public static void main(String[] args) {
		SpringApplication.run(SampleBackend.class, args);
	}
}
