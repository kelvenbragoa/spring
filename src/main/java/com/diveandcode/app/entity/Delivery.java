package com.diveandcode.app.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = true)
    private String observation_delivery;
    @Column(nullable = true)
    private String getObservation_returning;
    @Column(nullable = false)
    private Integer delivered_by_user_id;
    @Column(nullable = true)
    private Integer returned_by_user_id;
    @Column(nullable = false)
    private Date returned_date;
    @Column(nullable = false)
    private Integer employee_id;
    @Column(nullable = false)
    private Integer company_id;
    @Column(nullable = false)
    private Integer device_id;
    @Column(nullable = false)
    private Integer operation_id;

}
