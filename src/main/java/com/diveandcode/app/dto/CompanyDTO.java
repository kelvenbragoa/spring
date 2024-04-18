package com.diveandcode.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class CompanyDTO {
    private int id;
    private String name;
    private String address;
    private String city;
    private String province_id;

}
