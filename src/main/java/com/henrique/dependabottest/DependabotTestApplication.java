package com.henrique.dependabottest;

import org.apache.commons.text.StringSubstitutor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependabotTestApplication {

	public static void main(String[] args) {
		StringSubstitutor.createInterpolator();
		SpringApplication.run(DependabotTestApplication.class, args);
	}

}
