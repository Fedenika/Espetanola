package com.toogood.espetanola.auth.repository;

import com.toogood.espetanola.auth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String uesrname);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
}
