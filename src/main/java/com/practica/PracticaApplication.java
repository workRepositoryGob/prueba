package com.practica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@EnableDiscoveryClient
@SpringBootApplication
public class PracticaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticaApplication.class, args);
    }

}
