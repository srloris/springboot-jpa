package com.acme.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acme.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
