package com.diveandcode.app.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class CompanyDTO {
    private int id;
    @NotBlank(message = "O name e obrigatorio")
    @NotNull(message = "O name e obrigatorio")
    private String name;
    @NotBlank(message = "O endereco e obrigatorio")
    @NotNull(message = "O endereco e obrigatorio")
    private String address;
    @NotBlank(message = "A cidade e obrigatorio")
    @NotNull(message = "A cidade e obrigatorio")
    private String city;
    @NotBlank(message = "A provincia e obrigatorio")
    @NotNull(message = "A provincia e obrigatorio")
    private String province_id;

}
