package org.example.devicemanagementsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "devices")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "device_id", nullable = false, unique = true)
    private String deviceId;

    @Column(name = "device_name", nullable = false)
    private String deviceName;

    @Column(nullable = false)
    private String status;

    @Column(columnDefinition = "TEXT")
    private String configuration;

    @UpdateTimestamp
    @Column(name = "last_seen")
    private LocalDateTime lastSeen;
}
