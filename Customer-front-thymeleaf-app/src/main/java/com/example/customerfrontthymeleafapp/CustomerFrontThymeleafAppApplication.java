package com.example.customerfrontthymeleafapp;

import com.example.customerfrontthymeleafapp.entities.Customer;
import com.example.customerfrontthymeleafapp.repository.CustomerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerFrontThymeleafAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerFrontThymeleafAppApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepo customerRespository){
        return args-> {
            customerRespository.save(Customer.builder().name("Ayoub").email("ayoub@gmail.com").build());
            customerRespository.save(Customer.builder().name("Ahmed").email("ahmed@gmail.com").build());
            customerRespository.save(Customer.builder().name("kamal").email("kamal@gmail.com").build());
        };
    }
}
