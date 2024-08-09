package org.example.individualproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "org.example.individualproject.make.profile")

public class IndividualprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(IndividualprojectApplication.class, args);
    }

}
