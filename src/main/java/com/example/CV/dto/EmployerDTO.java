package com.example.CV.dto;

import lombok.Data;
import java.util.List;

@Data
public class EmployerDTO {
    private Long id;
    private String name;
    private List<ExperienceDTO> experiences; // Optional: If you need to include associated experiences
}
