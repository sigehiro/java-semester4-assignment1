package com.example.Assignment1;

import com.example.Assignment1.demo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Assignment1Application {

	public static void main(String[] args) {
		SpringApplication.run(Assignment1Application.class, args);

		//lombok起動check
//		User user = new User();
//		user.setName("John");
//		user.setAge(30);
//
//		System.out.println("Name: " + user.getName());
//		System.out.println("Age: " + user.getAge());
	}
}