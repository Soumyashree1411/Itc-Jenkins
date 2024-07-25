package com.itc.ItcJenkins;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class ItcJenkinsApplication {
	
	public static Logger Logger =LoggerFactory.getLogger(ItcJenkinsApplication.class);
	
	@PostConstruct
	public void myMethod()
	{
		Logger.info("Application Started");
	}

	public static void main(String[] args) {
		SpringApplication.run(ItcJenkinsApplication.class, args);
	}

}
