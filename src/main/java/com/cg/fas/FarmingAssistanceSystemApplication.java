package com.cg.fas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.cg.fas","com.bean"})
public class FarmingAssistanceSystemApplication {
	
	public static void main(String args[])
	{
		SpringApplication.run(FarmingAssistanceSystemApplication.class, args);
	}

}

