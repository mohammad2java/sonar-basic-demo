package com.amir.sonarbasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SonarBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SonarBasicApplication.class, args);
		new HelloService().hello();
	}

}
