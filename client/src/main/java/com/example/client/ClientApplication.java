package com.example.client;

import com.example.client.entities.Client;
import com.example.client.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

    @Bean
    CommandLineRunner initializeH2Database(ClientRepository clientRepository) {
        return args -> {
            clientRepository.save(new Client( "Amine SAFI", Float.parseFloat("23")));
            clientRepository.save(new Client( "Amal ALAOUI", Float.parseFloat("22")));
            clientRepository.save(new Client( "Samir RAMI", Float.parseFloat("22")));
        };
    }
}
