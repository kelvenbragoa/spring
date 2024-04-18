package com.diveandcode.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class DeviceDTO {
    private Integer id;
    private String name;
    private String make;
    private String model;
    private String serial;
    private String image;
    private Integer type_device_id;
    private Integer device_status_id;
    private Integer device_availability_id;
}
