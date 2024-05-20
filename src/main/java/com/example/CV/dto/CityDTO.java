package com.example.CV.dto;

import lombok.Data;
import java.util.List;

@Data
public class CityDTO {
    private Long id;
    private String name;
    private CountryDTO country;
    private List<AddressDTO> addresses;
    private List<ExperienceDTO> experiences;
    private List<InstitutionDTO> institutions;
}

