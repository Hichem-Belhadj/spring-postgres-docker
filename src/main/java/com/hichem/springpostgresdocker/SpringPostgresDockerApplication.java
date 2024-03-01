package com.hichem.springpostgresdocker;

import com.hichem.springpostgresdocker.models.Customer;
import com.hichem.springpostgresdocker.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SpringPostgresDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringPostgresDockerApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository) {
        return args -> {
            List<Customer> customers = List.of(
                Customer.builder()
                        .userName("Hichem")
                        .lastName("BELHADJ")
                        .build(),

                Customer.builder()
                        .userName("Zohra")
                        .lastName("BELHADJ")
                        .build(),

                Customer.builder()
                        .userName("Jasmine")
                        .lastName("BELHADJ")
                        .build(),

                Customer.builder()
                        .userName("Jessim")
                        .lastName("BELHADJ")
                        .build()
            );
            customerRepository.saveAll(customers);
        };
    }

}
