package org.example.devicemanagementsystem.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class PasswordConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
//$2a$10$Zo/Yb5e1v349zd1WPUKTTeO215nMsjnAjrrLuZMzZ1nVXbvLGO10q

//INSERT INTO users (
//        username,
//        email,
//        password,
//        role_id,
//        default_password,
//        created_at
//        )
//VALUES (
//  'admin',
//          'admin@test.com',
//          '$2a$10$Zo/Yb5e1v349zd1WPUKTTeO215nMsjnAjrrLuZMzZ1nVXbvLGO10q',
//          1,
//          true,
//  now()
//);
