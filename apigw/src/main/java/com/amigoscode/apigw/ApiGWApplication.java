package com.amigoscode.apigw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

// this is the main entry point of the application
// that will route requests to appropriate microservices
// thanks to configuration in application.yml

// note that managing an api gateway is not the best choice
// as it is hard, it's just better to use a managed one
// like the one provided by AWS, Azure, or Google Cloud

@EnableEurekaClient
@SpringBootApplication
public class ApiGWApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiGWApplication.class, args);
    }
}