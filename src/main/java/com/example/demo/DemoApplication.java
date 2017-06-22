package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.annotation.IntegrationComponentScan;

@SpringBootApplication
@EnableBinding({Out.class, In.class})
@IntegrationComponentScan
public class DemoApplication {

    public static void main( String[] args ) {
        SpringApplication.run( DemoApplication.class, args );
    }



}
