package com.diveandcode.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentDTO {

    private int id;
    private String firstName;
    private String lastName;
    private String city;
}
