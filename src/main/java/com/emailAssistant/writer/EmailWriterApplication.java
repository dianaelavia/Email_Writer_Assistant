package com.emailAssistant.writer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.emailAssistant.app", "com.emailAssistant.writer"})
public class EmailWriterApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailWriterApplication.class, args);
		System.out.println("Email Assistant");
	
	}

}
