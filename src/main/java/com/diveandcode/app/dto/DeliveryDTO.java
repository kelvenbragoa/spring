package com.diveandcode.app.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
    @NotBlank(message = "O funcionario e obrigatorio")
    @NotNull(message = "O funcionario e obrigatorio")
    private Integer employee_id;
    @NotBlank(message = "A empresa e obrigatorio")
    @NotNull(message = "A empresa e obrigatorio")
    private Integer company_id;
    @NotBlank(message = "O dispositivo e obrigatorio")
    @NotNull(message = "O dispositivo e obrigatorio")
    private Integer device_id;
    private Integer operation_id;
}
