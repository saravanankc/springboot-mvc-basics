package com.kc.mylearnings.springboot.basics.springbootmvcinfewsteps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootMvcInFewStepsApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringbootMvcInFewStepsApplication.class, args);

		System.out.println("Printing AutoConfigured Beans:");
		for (String name : applicationContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}
}
