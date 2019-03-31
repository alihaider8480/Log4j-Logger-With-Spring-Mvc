package com.spring.configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@ComponentScan(basePackages={"com.spring.*"})
@Configuration
@PropertySource(value={"classpath:app.properties"})
public class AppConfiguration 
{
	
}
