package com.example.batch.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
public class BatchConfig { 
	
	@Scheduled(fixedDelay = 5000)
	public void printCorn () {
		System.out.println("Running in fixed Delay..");
	}

}
