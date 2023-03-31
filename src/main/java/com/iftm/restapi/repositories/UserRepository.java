package com.iftm.restapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iftm.restapi.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{}
