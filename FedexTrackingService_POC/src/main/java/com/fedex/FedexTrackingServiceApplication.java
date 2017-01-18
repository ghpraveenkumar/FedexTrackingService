package com.fedex;

/**
 * @author Praveen
 *
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.fedex.controller","com.fedex.soapsamples.util","com.fedex"})
@SpringBootApplication
public class FedexTrackingServiceApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(FedexTrackingServiceApplication.class, args);
	}
	
    /**
     * Used when run as WAR
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(FedexTrackingServiceApplication.class);
    }
}
