package com.example.demo;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

//object that Springboot manipulates
@Entity
public class Person {
        //primary key of the entity
    @Id
        //used in conjunction with @Id to generate values
    @GeneratedValue
    private Long id;

    private String firstName;
    private String lastName;
    private Date birthDate;

        //empty constructor
    public Person() {
    }

        //Person constructor
    public Person(Long id, String firstName, String lastName, Date birthDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

        //getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id)  {
        this.id = id;
    }

    public String getFirstName()    {
        return firstName;
    }

    public void setFirstName(String firstName)  {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}   