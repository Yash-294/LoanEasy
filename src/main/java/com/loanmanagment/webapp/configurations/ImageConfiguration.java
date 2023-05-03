package com.loanmanagment.webapp.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ImageConfiguration implements WebMvcConfigurer{
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/LoanFiles/**")	//checks if url for requested file starts with "D:/LoanManagement/webapp/LoanFiles/"
				.addResourceLocations("classpath:/Loanfiles/"); //if yes then uses this url to find it on the server
	}
}
