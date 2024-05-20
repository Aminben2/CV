package com.example.CV.mapper;

import com.example.CV.dto.ExperienceTypeDTO;
import com.example.CV.entity.ExperienceType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ExperienceTypeMapper {

    public ExperienceTypeDTO experienceTypeToDTO(ExperienceType experienceType) {
        if (experienceType == null) return null;
        ExperienceTypeDTO experienceTypeDTO = new ExperienceTypeDTO();
        experienceTypeDTO.setId(experienceType.getId());
        experienceTypeDTO.setName(experienceType.getName());
        return experienceTypeDTO;
    }
}
