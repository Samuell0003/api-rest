package com.iftm.restapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iftm.restapi.models.Email;

@Repository
public interface EmailRepository extends JpaRepository<Email, Long>{
    
}
