package com.diveandcode.app.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO {
    private int id;
    @NotBlank(message = "O nome e obrigatorio")
    @NotNull(message = "O nome e obrigatorio")
    private String name;
    @NotBlank(message = "O email e obrigatorio")
    @NotNull(message = "O email e obrigatorio")
    private String email;
    @NotBlank(message = "O telefone e obrigatorio")
    @NotNull(message = "O telefone e obrigatorio")
    private String mobile;
    @NotNull(message = "O nivel e obrigatorio")
    private Integer role_id;
    @NotBlank(message = "O password e obrigatorio")
    @NotNull(message = "O password e obrigatorio")
    @Min(8)
    private String password;
}
