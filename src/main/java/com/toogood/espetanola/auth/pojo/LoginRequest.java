package com.toogood.espetanola.auth.pojo;

import lombok.Data;

@Data
public class LoginRequest {

    private String username;
    private String password;
}
