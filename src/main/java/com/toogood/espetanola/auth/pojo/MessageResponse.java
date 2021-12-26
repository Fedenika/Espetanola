package com.toogood.espetanola.auth.pojo;

import lombok.Data;

@Data
public class MessageResponse {

    private String massage;

    public MessageResponse(String massage) {
        this.massage = massage;
    }
}
