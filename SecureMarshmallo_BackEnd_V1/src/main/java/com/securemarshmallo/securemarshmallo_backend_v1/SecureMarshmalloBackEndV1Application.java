package com.securemarshmallo.securemarshmallo_backend_v1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SecureMarshmalloBackEndV1Application {

    public static void main(String[] args) {
        SpringApplication.run(SecureMarshmalloBackEndV1Application.class, args);
    }

}
