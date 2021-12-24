package com.toogood.espetanola.auth.repository;

import com.toogood.espetanola.auth.model.ERole;
import com.toogood.espetanola.auth.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
