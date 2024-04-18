package com.diveandcode.app.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String make;
    @Column(nullable = false)
    private String model;
    @Column(nullable = false)
    private String serial;
    @Column(nullable = false)
    private String image;
    @Column(nullable = false)
    private Integer type_device_id;
    @Column(nullable = false)
    private Integer device_status_id;
    @Column(nullable = false)
    private Integer device_availability_id;

}
