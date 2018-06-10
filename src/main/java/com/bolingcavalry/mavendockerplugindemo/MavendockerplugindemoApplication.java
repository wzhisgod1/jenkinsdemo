package com.bolingcavalry.mavendockerplugindemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class MavendockerplugindemoApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MavendockerplugindemoApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(MavendockerplugindemoApplication.class, args);
	}
}
