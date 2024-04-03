package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		String regexPattern = "tra(vel|ce|de)m";
		Pattern pattern = Pattern.compile(regexPattern);
		for(String value : values) {
			Matcher matcher = pattern.matcher(value);
			if (matcher.matches()) {
				// do something
			}
		}

		SpringApplication.run(DemoApplication.class, args);
	}

}
