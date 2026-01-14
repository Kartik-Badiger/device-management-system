package org.example.devicemanagementsystem.config;

import org.example.devicemanagementsystem.entity.Role;
import org.example.devicemanagementsystem.repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initRoles(RoleRepository roleRepository) {
        return args -> {
            createRoleIfNotExists(roleRepository, "ADMIN");
            createRoleIfNotExists(roleRepository, "OPERATOR");
            createRoleIfNotExists(roleRepository, "VIEWER");
        };
    }

    private void createRoleIfNotExists(RoleRepository roleRepository, String roleName) {
        roleRepository.findByName(roleName)
                .orElseGet(() -> roleRepository.save(new Role(null, roleName)));
    }
}
