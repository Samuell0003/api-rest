package com.iftm.restapi.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.iftm.restapi.models.Email;
import com.iftm.restapi.services.EmailService;

@RestController
@RequestMapping("api/v1/")
public class EmailController {

    @Autowired
    EmailService service;

    @GetMapping("email/{id}")
    public Optional<Email>findById(@PathVariable("id") Long id) {return service.findById(id);}

    @PostMapping("email")
    public Email save(@RequestBody Email email) { return service.save(email);}
    
    @PutMapping("email")
    public Email update(@RequestBody Email email) { return service.update(email);}

    @DeleteMapping("email/{id}")
    public void delete(@PathVariable("id") Long id) { service.delete(id);}
}
