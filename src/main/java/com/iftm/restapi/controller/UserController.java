package com.iftm.restapi.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.iftm.restapi.models.User;
import com.iftm.restapi.services.UserService;

@RestController
@RequestMapping("api/v1/")
public class UserController {
    
    @Autowired
    UserService service;

    @GetMapping("user/{id}")
    public Optional<User>findById(@PathVariable("id") Long id) {return service.findById(id);}

    @PostMapping("user")
    public User save(@RequestBody User user) { return service.save(user);}
    
    @PutMapping("user")
    public User update(@RequestBody User user) { return service.update(user);}

    @DeleteMapping("user/{id}")
    public void delete(@PathVariable("id") Long id) { service.delete(id);}

}
