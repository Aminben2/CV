package com.example.CV.dto;

import lombok.Data;
import java.util.List;

@Data
public class CountryDTO {
    private Long id;
    private String name;
    private List<CityDTO> cities;
    private List<ResumeDTO> resumes;
}
