package com.example.CV.dto;

import lombok.Data;

@Data
public class AddressDTO {
    private Long id;
    private String addressDescription;
    private Integer postalCode;
    private CityDTO city;
}
