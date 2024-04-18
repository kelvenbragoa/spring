package com.diveandcode.app.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TransactionDTO {
    private Integer id;
    @NotNull(message = "O delivery id e obrigatorio")
    private Integer delivery_id;
    @NotNull(message = "O dispositivo e obrigatorio")
    private Integer device_id;
    @NotNull(message = "O usuario e obrigatorio")
    private Integer user_id;
    @NotNull(message = "O funcionario e obrigatorio")
    private Integer employee_id;
    @NotNull(message = "A operacao e obrigatorio")
    private Integer operation_id;
}
