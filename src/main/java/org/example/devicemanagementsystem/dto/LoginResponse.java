package org.example.devicemanagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class LoginResponse {

    private String token;
    private boolean forcePasswordChange;
    private String role;
}
