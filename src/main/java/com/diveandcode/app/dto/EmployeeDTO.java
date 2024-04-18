package com.diveandcode.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmployeeDTO {
    private Integer id;
    private String name;
    private String email;
    private String mobile;
    private Integer company_id;
}
