package com.toogood.espetanola.controller;

import java.util.List;

import com.toogood.espetanola.dto.UserF;
import com.toogood.espetanola.exception.UserNotFoundException;
import com.toogood.espetanola.repository.UserFRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class UserController {

    private final UserFRepository repository;

    UserController(UserFRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/user")
    List<UserF> all() {
        return repository.findAll();
    }

    @PostMapping("/user")
    UserF newEmployee(@RequestBody UserF newUserF) {
        return repository.save(newUserF);
    }

    @GetMapping("/user/{id}")
    UserF one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
    }

    @PutMapping("/user/{id}")
    UserF replaceUser(@RequestBody UserF newUserF, @PathVariable Long id) {

        return repository.findById(id)
                .map(userF -> {
                    userF.setEmail(newUserF.getEmail());
                    userF.setPassword_hash(newUserF.getPassword_hash());
                    userF.setName(newUserF.getName());
                    return repository.save(userF);
                })
                .orElseGet(() -> {
                    newUserF.setId(id);
                    return repository.save(newUserF);
                });
    }

    @DeleteMapping("/user/{id}")
    void deleteUser(@PathVariable Long id) {
        repository.deleteById(id);
    }
}