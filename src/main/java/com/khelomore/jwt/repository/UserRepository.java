package com.khelomore.jwt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.khelomore.jwt.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByUsername(String username);
    Optional<User>findBymobilenumber(String mobilenumber);
	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);
}
