package com.example.CV.dto;

import lombok.Data;
import java.util.List;

@Data
public class ExperienceTypeDTO {
    private Long id;
    private String name;
    private List<ExperienceDTO> experiences;
}
