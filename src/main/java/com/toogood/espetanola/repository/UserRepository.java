package com.toogood.espetanola.repository;

import com.toogood.espetanola.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

