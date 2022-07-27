package com.example.demo;

import com.example.demo.component.ComponentDependency;
import com.example.demo.component.ComponentImplement;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootFundamentalsApplication implements CommandLineRunner {

	public ComponentDependency componentDependency;

	public SpringBootFundamentalsApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency) {
		this.componentDependency = componentDependency;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFundamentalsApplication.class, args);
	}

	@Override
	public void run(String... args) {
		componentDependency.SayHi();
	}
}
