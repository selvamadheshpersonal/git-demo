package com.example.gitdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitDemoApplication.class, args);
	}

	public void bugfix() {
		System.out.println("Bugfix");
	}
	public void feature() {
		System.out.println("Feature");
	}
}
