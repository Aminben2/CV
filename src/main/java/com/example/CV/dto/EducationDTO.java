package com.example.CV.dto;

import lombok.Data;
import java.time.LocalDate;
import java.util.List;

@Data
public class EducationDTO {
    private Long id;
    private LocalDate startDate;
    private LocalDate endDate;
    private DegreeDTO degree;
    private List<ResumeDTO> resumes;
}
