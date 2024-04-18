package com.diveandcode.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TransactionDTO {
    private Integer id;
    private Integer delivery_id;
    private Integer device_id;
    private Integer user_id;
    private Integer employee_id;
    private Integer operation_id;
}
