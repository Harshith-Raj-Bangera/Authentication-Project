package com.authentication.authentication_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.authentication.authentication_system.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
