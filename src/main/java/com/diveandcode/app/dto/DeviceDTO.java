package com.diveandcode.app.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class DeviceDTO {
    private Integer id;
    @NotBlank(message = "O nome e obrigatorio")
    @NotNull(message = "O nome e obrigatorio")
    private String name;
    @NotBlank(message = "A marca e obrigatorio")
    @NotNull(message = "A marca e obrigatorio")
    private String make;
    @NotBlank(message = "O modelo e obrigatorio")
    @NotNull(message = "O modelo e obrigatorio")
    private String model;
    @NotBlank(message = "O serial e obrigatorio")
    @NotNull(message = "O serial e obrigatorio")
    private String serial;
    @NotBlank(message = "A imagem e obrigatorio")
    @NotNull(message = "A imagem e obrigatorio")
    private String image;
    @NotBlank(message = "O tipo de dispositivo e obrigatorio")
    @NotNull(message = "O tipo de dispositivo e obrigatorio")
    private Integer type_device_id;
    @NotBlank(message = "O status e obrigatorio")
    @NotNull(message = "O status e obrigatorio")
    private Integer device_status_id;
    @NotBlank(message = "A disponibilidade e obrigatorio")
    @NotNull(message = "A disponibilidade e obrigatorio")
    private Integer device_availability_id;
}
