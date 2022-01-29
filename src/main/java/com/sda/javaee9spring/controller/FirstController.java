package com.sda.javaee9spring.controller;

import lombok.Data;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Slf4j
@RequestMapping("/first")
public class FirstController {

    //the same as @Slf4j
    //private static final Logger log = LoggerFactory.getLogger(FirstController.class);


    @GetMapping({"/my-first-page", "/"})
    public String firstPage() {
        log.info("firstPage() method called!");
        //looking for html page inside resources/templates
        return "home-page";
    }

    @GetMapping("/second-page")
    public String secondPage() {
        log.info("secondPage() method called");
        return "second-page";
    }

    @GetMapping(value = {"/third-page", "/third-too", "/abcd"})
    public String thirdPage() {
        log.info("thirdPage() method called");
        return "pages/third-page";
    }

    // /my-name?name=lyanne&surname=raud
    @GetMapping("/my-name")
    public String myName(@RequestParam(value = "name", defaultValue = "Mari") String myName,
                         @RequestParam(value = "surname", defaultValue = "Mets") String mySurname,
                         Model pageParameters) {
        log.info("myName() method called");
        log.info("my name is: [{}] and my surname is: [{}]", myName, mySurname);

        pageParameters.addAttribute("myName", myName)
                .addAttribute("mySurname", mySurname);
        return "pages/name-and-surname";
    }
    @PostMapping("/my-first-post")
    public String myFirstOtherThanGetHttpMethod() {
        log.info("myFirstOtherThanGetHttpMethod() was called");
        return "pages/post-page";
    }
    @GetMapping("/converter")
    public String converter(@RequestParam(value= "name", defaultValue = "Martin")String name,
                            @RequestParam(value = "height", defaultValue = "180") double heightInCm,
                            @RequestParam(value = "weight", defaultValue = "90") double weightInKg,
                            Model parameters){
        double heightInInch = heightInCm * 0.4;
        double weightInPound = weightInKg * 2.2;
        log.info("converter() method called");
        log.info("name: [{}], height in cm: [{}], weight in kg: [{}]", name, heightInCm, weightInKg);
        log.info("name: [{}], height in inches: [{}], weight in pounds: [{}]", name, heightInInch, weightInPound);
        parameters.addAttribute("name", name)
                .addAttribute("height", heightInCm)
                .addAttribute("weight", weightInKg)
                .addAttribute("heightInInch", heightInInch)
                .addAttribute("weightInPound", weightInPound);
        return "pages/converted-values";
    }
}
