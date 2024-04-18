package com.diveandcode.app.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmployeeDTO {
    private Integer id;
    @NotBlank(message = "O nome e obrigatorio")
    @NotNull(message = "O nome e obrigatorio")
    private String name;
    @NotBlank(message = "O email e obrigatorio")
    @NotNull(message = "O email e obrigatorio")
    private String email;
    @NotBlank(message = "O telefone e obrigatorio")
    @NotNull(message = "O telefone e obrigatorio")
    private String mobile;
    @NotBlank(message = "O empresa e obrigatorio")
    @NotNull(message = "O empresa e obrigatorio")
    private Integer company_id;
}
