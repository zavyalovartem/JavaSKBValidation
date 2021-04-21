package com.example.homework5;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/person")
public class PersonController {

    @PostMapping(value = "/person", consumes = "application/json")
    public void getPerson(@Valid @RequestBody Person person){
        System.out.println("");
    }
}
