package com.saroj.camelroute;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCamelRouteExampleApplication {

	@Autowired
	CamelContext camelContext;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCamelRouteExampleApplication.class, args);
	}
	
	 @Bean
	    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {

	       return args -> {

	            camelContext.addRoutes(new RouteBuilder() {
	 
	             public void configure() {
	               from("file:/Users/saroj.das/Desktop/Resume/in?noop=true").to("file:/Users/saroj.das/Desktop/Resume/out");
	            } 
	 
	         });

	        };
	 }
}
