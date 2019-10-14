package com.digitalworksolutions.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@SuppressWarnings("deprecation")
@Configuration
@ComponentScan(basePackages = "com.digitalworksolutions")

@EnableAutoConfiguration
public class SpringBootConfig extends SpringBootServletInitializer {
	
	 private static Class applicationClass = SpringBootConfig.class;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootConfig.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }

}