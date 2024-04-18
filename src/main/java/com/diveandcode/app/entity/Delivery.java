package com.diveandcode.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    private String observation_delivery;
    private String getObservation_returning;
    private Integer delivered_by_user_id;
    private Integer returned_by_user_id;
    private Date returned_date;
    private Integer employee_id;
    private Integer company_id;
    private Integer device_id;
    private Integer operation_id;

}
