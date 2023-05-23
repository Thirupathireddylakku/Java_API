package com.springboot.rest.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootApiAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringbootApiAppApplication.class, args);
		
	int beanDefinitionCount = run.getBeanDefinitionCount();

	System.out.println(beanDefinitionCount);
		
		System.out.println("success......!");
	}

}
