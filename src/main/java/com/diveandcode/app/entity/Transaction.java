package com.diveandcode.app.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)

    private Integer delivery_id;
    @Column(nullable = false)
    private Integer device_id;
    @Column(nullable = false)
    private Integer user_id;
    @Column(nullable = false)
    private Integer employee_id;
    @Column(nullable = false)
    private Integer operation_id;

}
