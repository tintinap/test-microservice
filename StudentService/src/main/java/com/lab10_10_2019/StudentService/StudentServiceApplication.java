package com.lab10_10_2019.StudentService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class StudentServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(StudentServiceApplication.class, args);
	}
	@RequestMapping(value = "/v1/student/{id}")
	Student Home(@PathVariable int id) {

		return new Student(id);
	}
	@RequestMapping(value = "/")
	String Index() {
		String s = "hello world";
		return s;
	}
}
