package com.iftm.restapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iftm.restapi.models.User;
import com.iftm.restapi.repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> findAll() { return repository.findAll();}

    public Optional<User> findById(Long id) { return repository.findById(id);}

    public User save(User user) {
        if (!user.getFirstName().isBlank() && !user.getFirstName().isEmpty()) {
            return repository.save(user);
        }
        return null;
    }

    public User update(User user) {
        if (!user.getFirstName().isBlank() && !user.getFirstName().isEmpty()) {
            var dbUser = repository.findById(user.getId());
            if (dbUser.isPresent()) return repository.save(user);
        }
        return null;
    }

    public void delete(Long id) {
        var dbUser = repository.findById(id);
        if (dbUser.isPresent()) repository.deleteById(id);
    }

}
