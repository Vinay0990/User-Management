package com.nilam.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nilam.dev.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
