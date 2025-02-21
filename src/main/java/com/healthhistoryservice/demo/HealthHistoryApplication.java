package com.healthhistoryservice.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;
/**
 *  author:
 *  functionality : 
 * 
 */
@SpringBootApplication
@EnableScheduling
@EnableAspectJAutoProxy
public class HealthHistoryApplication {

	public static void main(String[] args) {			
		SpringApplication.run(HealthHistoryApplication.class, args);
	}

}
