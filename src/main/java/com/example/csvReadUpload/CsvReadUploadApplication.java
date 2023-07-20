package com.example.csvReadUpload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CsvReadUploadApplication {

	public static void main(String[] args) {
		SpringApplication.run(CsvReadUploadApplication.class, args);
		System.out.print("Server is running on port 8081!");
	}

}
