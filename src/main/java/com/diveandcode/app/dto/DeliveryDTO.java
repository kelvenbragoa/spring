package com.diveandcode.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DeliveryDTO {
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
