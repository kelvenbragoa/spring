package com.diveandcode.app.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RoleDTO {
    private Integer id;
    @NotBlank(message = "O nome e obrigatorio")
    @NotNull(message = "O nome e obrigatorio")
    private String name;
}
