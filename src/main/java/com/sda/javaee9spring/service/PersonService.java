package com.sda.javaee9spring.service;

import com.sda.javaee9spring.entity.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    public List<Person> getAllPersons(){
        var persons = List.of(
                new Person("Martin", "Kalju", 34),
                new Person("Külli", "Kase", 25),
                new Person("Roosi", "Reemus", 26)
        );
        return persons;
    }
}
