package com.amigoscode.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

// https://stackoverflow.com/questions/60349535/what-is-use-of-enableeurekaclient
@SpringBootApplication
// not actually required because it auto-registers the microservice
// as long as properties are configured
@EnableEurekaClient
public class NotificationApplication {
    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class, args);
    }
}
