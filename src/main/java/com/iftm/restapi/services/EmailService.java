package com.iftm.restapi.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iftm.restapi.models.Email;
import com.iftm.restapi.repositories.EmailRepository;

@Service
public class EmailService {

    @Autowired
    private EmailRepository repository;

    public Optional<Email> findById(Long id) {return repository.findById(id);}

    public Email save(Email email) {
        //if (!email.getTo().isBlank() && !email.getTo().isEmpty()) 
        return repository.save(email);
        

        //return null;
    }

    public Email update(Email email) {
        if (!email.getTo().isBlank() && !email.getTo().isEmpty()) {
            var dbEmail = repository.findById(email.getId());

            if (dbEmail.isPresent()) return repository.save(email);
        }
        return null;
    }

    public void delete(Long id) {
        var dbEmail = repository.findById(id);

        if (dbEmail.isPresent()) repository.deleteById(id);

    }
}
