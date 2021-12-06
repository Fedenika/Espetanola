package com.toogood.espetanola.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity @Data
public class User {
    private @Id @GeneratedValue Long id;
    private String email;
    private String password_hash;
    private String name;

    public User(String email, String password_hash, String name) {
        this.email = email;
        this.password_hash = password_hash;
        this.name = name;
    }

    public User() {

    }
}