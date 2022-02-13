package com.sda.javaee9spring.controller.rest;

import com.sda.javaee9spring.entity.PersonEntity;
import com.sda.javaee9spring.service.RealPersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/")
public class PersonRestController {

    private final RealPersonService personService;

    public PersonRestController(RealPersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/persons")
    public List<PersonEntity> findAllPersons(){
        log.info("findAllPersons()");

        return personService.readAllPersonEntities();
    }
    @GetMapping("/persons/{id}")
    public PersonEntity findPersonEntityById(@PathVariable("id") Long personId) {
        log.info("trying to find person entity by id: [{}]", personId);

        return personService.readPersonEntityById(personId);
    }
    }


