package org.stephane.backetback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"org.stephane.backetback.jpa.entities"})
public class BacketBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(BacketBackApplication.class, args);
    }

}
