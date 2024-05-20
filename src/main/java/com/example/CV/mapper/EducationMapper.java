package com.example.CV.mapper;

import com.example.CV.dto.EducationDTO;
import com.example.CV.entity.Education;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class EducationMapper {

     private final DegreeMapper degreeMapper;
    public EducationDTO educationToDTO(Education education) {
        if (education == null) return null;

        EducationDTO educationDTO = new EducationDTO();
        educationDTO.setId(education.getId());
        educationDTO.setStartDate(education.getStartDate());
        educationDTO.setEndDate(education.getEndDate());
        educationDTO.setDegree(degreeMapper.degreeToDTO(education.getDegree())); // Assuming you have a method to convert Degree entities to DegreeDTOs

        return educationDTO;
    }

    public List<EducationDTO> educationsToDTO(List<Education> educations) {
        List<EducationDTO> educationDTOs = new ArrayList<>();
        for (Education education : educations) {
            EducationDTO educationDTO = educationToDTO(education);
            educationDTOs.add(educationDTO);
        }
        return educationDTOs;
    }
}
