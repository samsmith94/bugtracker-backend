package com.java.bugtracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class BugtrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BugtrackerApplication.class, args);
	}

}
