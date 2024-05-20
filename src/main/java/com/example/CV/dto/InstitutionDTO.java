package com.example.CV.dto;

import lombok.Data;

@Data
public class InstitutionDTO {
    private Long id;
    private String name;
    private CityDTO city;
}
