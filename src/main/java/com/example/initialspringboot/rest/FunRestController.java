package com.example.initialspringboot.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project name: InitialSpringBoot
 * Author: AvaZ
 * Data: 4/16/2024
 * Time: 1:38 PM
 **/
@RestController
public class FunRestController {
    // inject properties coach.name & team.name
    @Value("${coach.name}")
    String coachName;

    @Value("${team.name}")
    String teamName;


    // expose new endpoint for "teamInfo"
    @GetMapping("/getNameInfo")
    public String getNameInfo() {
        return "coachName: " + coachName + "teamName: " + teamName;
    }

    @GetMapping(path = "/greeting")
    public String greeting() {
        return "Hello World !";
    }

    @GetMapping("/fortune")
    public String GetDailyFortune() {
        return "Today is your lucky day!";
    }

}
