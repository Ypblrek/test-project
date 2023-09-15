package com.tms.Sesurity.Domain;

import lombok.Data;

@Data
public class AuthRequest {
    private String login;
    private String password;
}
