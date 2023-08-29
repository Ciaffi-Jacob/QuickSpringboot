package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import jakarta.annotation.PostConstruct;

    //indicates the class is a source of bean definition
@Configuration
public class PersonConfig {
        //automatic dependency injection
    @Autowired
    private PersonRepository repository;

        //Pre filles database with 2 person objects
    @PostConstruct
    public void setup() {
                //constructors
        Person person1 = new Person();
        person1.setFirstName("Jake");
        person1.setLastName("Ciaffi");

        Person person2 = new Person();
        person2.setFirstName("John");
        person2.setLastName("Smith");

            //save people to database
        repository.saveAll(Arrays.asList(person1, person2));
    }
}
