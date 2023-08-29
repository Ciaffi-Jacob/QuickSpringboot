package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import jakarta.annotation.PostConstruct;

@Configuration
public class PersonConfig {
    @Autowired
    private PersonRepository repository;

    @PostConstruct
    public void setup() {
        Person person1 = new Person();
        person1.setFirstName("Jake");
        person1.setLastName("Ciaffi");

        Person person2 = new Person();
        person2.setFirstName("John");
        person2.setLastName("Smith");

        repository.saveAll(Arrays.asList(person1, person2));
    }
}
