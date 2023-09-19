package com.SoftwareNoe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication (exclude = DataSourceAutoConfiguration.class) 
public class SoftwareNoeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoftwareNoeApplication.class, args);
		
	}

}
