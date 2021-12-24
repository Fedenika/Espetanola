package com.toogood.espetanola.auth.pojo;

import com.toogood.espetanola.auth.model.Role;
import lombok.Data;

import java.util.List;

@Data
public class JwtResponse {

    private String token;
    private String type = "Bearer";
    private Long id;
    private String username;
    private String email;
    private List<Role> roles;
}
