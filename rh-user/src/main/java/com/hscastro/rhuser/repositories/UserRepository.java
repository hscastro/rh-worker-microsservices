package com.hscastro.rhuser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hscastro.rhuser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
